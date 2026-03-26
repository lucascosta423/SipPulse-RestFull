package com.sippulse.soapadapter.config.ws;

import com.sippulse.soapadapter.client.whitelistWS.SipPulse;
import com.sippulse.soapadapter.client.whitelistWS.WhiteListWS;
import com.sippulse.soapadapter.config.soap.properties.SoapProperties;
import com.sippulse.soapadapter.factory.SoapClientFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WhitelistWSConfig {

    @Bean
    public WhiteListWS whiteListWS(SoapProperties properties, SoapClientFactory factory) {
        return factory.createClient(
                properties.getEndpoints().getWhitelist(),
                SipPulse::new,
                SipPulse::getWhiteListWSPort
        );
    }
}
