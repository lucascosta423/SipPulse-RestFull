package com.sippulse.soapadapter.sippulse.service;


import com.sippulse.soapadapter.sippulse.client.subscriberWS.SipPulse;
import com.sippulse.soapadapter.sippulse.client.subscriberWS.SubscriberWS;
import com.sippulse.soapadapter.sippulse.config.SoapProperties;
import com.sippulse.soapadapter.sippulse.factory.SoapClientFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SubscriberWSService {

    @Bean
    public SubscriberWS subscriberWS(SoapClientFactory factory, SoapProperties properties) {

        return factory.createClient(
                properties.getEndpoints().get("subscriber"),
                SipPulse.class,
                "getSubscriberWSPort"
        );

    }
}
