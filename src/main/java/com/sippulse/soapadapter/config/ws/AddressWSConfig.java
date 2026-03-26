package com.sippulse.soapadapter.config.ws;

import com.sippulse.soapadapter.client.addressWS.AddressWS;
import com.sippulse.soapadapter.client.addressWS.SipPulse;
import com.sippulse.soapadapter.config.soap.properties.SoapProperties;
import com.sippulse.soapadapter.factory.SoapClientFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AddressWSConfig {

        @Bean
        public AddressWS addressWS(SoapProperties properties, SoapClientFactory factory) {
            String baseUrl = properties.getEndpoints().getAddress();

            return factory.createClient(
                    baseUrl,
                    SipPulse::new,
                    SipPulse::getAddressWSPort
            );
        }
}
