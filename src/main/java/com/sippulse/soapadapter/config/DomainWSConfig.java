package com.sippulse.soapadapter.config;

import com.sippulse.soapadapter.client.domainWS.DomainWS;
import com.sippulse.soapadapter.client.domainWS.SipPulse;
import com.sippulse.soapadapter.sippulse.config.SoapProperties;
import jakarta.xml.ws.BindingProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URL;

@Configuration
public class DomainWSConfig {

    @Bean
    public DomainWS domainWS(SoapProperties properties) {
        try {
            String baseUrl = properties.getEndpoints().get("domain");

            URL wsdlUrl = new URL(baseUrl + "?wsdl");

            SipPulse service = new SipPulse(wsdlUrl);

            DomainWS port = service.getDomainWSPort();

            configure((BindingProvider) port, baseUrl);

            return port;
        } catch (Exception e) {
            throw new RuntimeException("Erro ao criar DomainWS", e);
        }
    }

    private void configure(BindingProvider bp, String baseUrl) {
        bp.getRequestContext().put(
                BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                baseUrl
        );
        bp.getRequestContext().put("com.sun.xml.ws.connect.timeout", 5000);
        bp.getRequestContext().put("com.sun.xml.ws.request.timeout", 10000);
    }
}
