package com.sippulse.soapadapter.config;

import com.sippulse.soapadapter.client.ratePlanWS.RatePlanWS;
import com.sippulse.soapadapter.client.ratePlanWS.SipPulse;

import jakarta.xml.ws.BindingProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URL;

@Configuration
public class RatePlanWSConfig {

    @Bean
    public RatePlanWS ratePlanWS(SoapProperties properties) {
        try {
            String baseUrl = properties.getEndpoints().get("ratePlan");

            URL wsdlUrl = new URL(baseUrl + "?wsdl");

            SipPulse service = new SipPulse(wsdlUrl);

            RatePlanWS port = service.getRatePlanWSPort();

            configure((BindingProvider) port, baseUrl);

            return port;
        } catch (Exception e) {
            throw new RuntimeException("Erro ao criar RatePlanWS", e);
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
