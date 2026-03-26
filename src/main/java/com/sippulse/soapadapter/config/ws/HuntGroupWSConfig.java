package com.sippulse.soapadapter.config.ws;

import com.sippulse.soapadapter.client.huntGroupWS.HuntGroupWS;
import com.sippulse.soapadapter.client.huntGroupWS.SipPulse;

import com.sippulse.soapadapter.config.soap.properties.SoapProperties;
import com.sippulse.soapadapter.factory.SoapClientFactory;
import jakarta.xml.ws.BindingProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URL;

@Configuration
public class HuntGroupWSConfig {

    @Bean
    public HuntGroupWS huntGroupWS(SoapProperties properties, SoapClientFactory factory) {
        return factory.createClient(
                properties.getEndpoints().getHuntGroup(),
                SipPulse::new,
                SipPulse::getHuntGroupWSPort
        );
    }

}
