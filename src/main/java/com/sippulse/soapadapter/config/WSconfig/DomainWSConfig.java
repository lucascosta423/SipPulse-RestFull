package com.sippulse.soapadapter.config.WSconfig;

import com.sippulse.soapadapter.client.domainWS.DomainWS;
import com.sippulse.soapadapter.client.domainWS.SipPulse;
import com.sippulse.soapadapter.config.soap.SoapProperties;
import com.sippulse.soapadapter.factory.SoapClientFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DomainWSConfig {

    @Bean
    public DomainWS domainWS(SoapProperties properties, SoapClientFactory factory){
        String baseUrl = properties.getEndpoints().get("domain");

        return factory.createClient(
                baseUrl,
                SipPulse::new,
                SipPulse::getDomainWSPort
        );
    }
}
