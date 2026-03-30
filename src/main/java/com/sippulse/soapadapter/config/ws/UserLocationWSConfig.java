package com.sippulse.soapadapter.config.ws;

import com.sippulse.soapadapter.client.userLocationWS.SipPulse;
import com.sippulse.soapadapter.client.userLocationWS.UserLocationWS;
import com.sippulse.soapadapter.config.soap.properties.SoapProperties;
import com.sippulse.soapadapter.factory.SoapClientFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserLocationWSConfig {

    @Bean
    public UserLocationWS userLocationWS(SoapProperties properties, SoapClientFactory factory) {
       return factory.createClient(
               properties.getEndpoints().getUserLocation(),
               SipPulse::new,
               SipPulse::getUserLocationWSPort
       );
    }
}
