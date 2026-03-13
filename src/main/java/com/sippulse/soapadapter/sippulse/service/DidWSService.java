package com.sippulse.soapadapter.sippulse.service;

import com.sippulse.soapadapter.sippulse.client.didWS.DidWS;
import com.sippulse.soapadapter.sippulse.client.didWS.SipPulse;
import com.sippulse.soapadapter.sippulse.config.SoapProperties;
import com.sippulse.soapadapter.sippulse.factory.SoapClientFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DidWSService {

    @Bean
    public DidWS didWS(SoapClientFactory factory,SoapProperties properties) {

        return factory.createClient(
                properties.getEndpoints().get("did"),
                SipPulse.class,
                "getDidWSPort"
        );

    }

}
