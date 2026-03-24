package com.sippulse.soapadapter.config.WSconfig;

import com.sippulse.soapadapter.client.addressWS.AddressWS;
import com.sippulse.soapadapter.client.addressWS.SipPulse;
import com.sippulse.soapadapter.config.soap.SoapProperties;
import com.sippulse.soapadapter.factory.SoapClientFactory;
import jakarta.xml.ws.BindingProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URL;

@Configuration
public class AddressWSConfig {

        @Bean
        public AddressWS addressWS(SoapProperties properties, SoapClientFactory factory) {
            String baseUrl = properties.getEndpoints().get("address");

            return factory.createClient(
                    baseUrl,
                    SipPulse::new,
                    SipPulse::getAddressWSPort
            );
        }
}
