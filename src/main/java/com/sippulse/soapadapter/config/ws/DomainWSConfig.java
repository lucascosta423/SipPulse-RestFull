package com.sippulse.soapadapter.config.ws;

import com.sippulse.soapadapter.client.domainWS.DomainWS;
import com.sippulse.soapadapter.client.domainWS.SipPulse;
import com.sippulse.soapadapter.config.soap.properties.SoapProperties;
import com.sippulse.soapadapter.factory.SoapClientFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DomainWSConfig {

    @Bean
    public DomainWS domainWS(SoapProperties properties, SoapClientFactory factory){
             return factory.createClient(
                properties.getEndpoints().getDomain(),
                SipPulse::new,
                SipPulse::getDomainWSPort
        );
    }
}
