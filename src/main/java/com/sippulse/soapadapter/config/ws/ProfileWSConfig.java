package com.sippulse.soapadapter.config.ws;

import com.sippulse.soapadapter.client.profileWS.ProfileWS;
import com.sippulse.soapadapter.client.profileWS.SipPulse;

import com.sippulse.soapadapter.config.soap.properties.SoapProperties;
import com.sippulse.soapadapter.factory.SoapClientFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProfileWSConfig {

    @Bean
    public ProfileWS profileWS(SoapProperties properties, SoapClientFactory factory) {
        return factory.createClient(
                properties.getEndpoints().getProfile(),
                SipPulse::new,
                SipPulse::getProfileWSPort
        );
    }

}
