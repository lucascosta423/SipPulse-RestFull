package com.sippulse.soapadapter.config.ws;


import com.sippulse.soapadapter.client.subscriberWS.SipPulse;
import com.sippulse.soapadapter.client.subscriberWS.SubscriberWS;
import com.sippulse.soapadapter.config.soap.properties.SoapProperties;
import jakarta.xml.ws.BindingProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URL;

@Configuration
public class SubscriberWSConfig {

    @Bean
    public SubscriberWS subscriberWS(SoapProperties properties) {
        try {
            String baseUrl = properties.getEndpoints().getSubscriber();

            URL wsdlUrl = new URL(baseUrl + "?wsdl");

            SipPulse service = new SipPulse(wsdlUrl);

            SubscriberWS port = service.getSubscriberWSPort();

            configure((BindingProvider) port, baseUrl);

            return port;

        } catch (Exception e) {
            throw new RuntimeException("Erro ao criar SubscriberWS", e);
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
