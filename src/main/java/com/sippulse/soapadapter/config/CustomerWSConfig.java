package com.sippulse.soapadapter.config;


import com.sippulse.soapadapter.client.customerWS.CustomerWS;
import com.sippulse.soapadapter.client.customerWS.SipPulse;
import com.sippulse.soapadapter.sippulse.config.SoapProperties;
import jakarta.xml.ws.BindingProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URL;

@Configuration
public class CustomerWSConfig {

    @Bean
    public CustomerWS customerWS(SoapProperties properties){
        try {
            String baseUrl = properties.getEndpoints().get("customer");

            URL wsdlUrl = new URL(baseUrl + "?wsdl");

            SipPulse service = new SipPulse(wsdlUrl);

            CustomerWS port = service.getCustomerWSPort();

            configure((BindingProvider) port, baseUrl);

            return port;

        } catch (Exception e) {
            throw new RuntimeException("Erro ao criar CustomerWS", e);
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
