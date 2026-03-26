package com.sippulse.soapadapter.config.ws;

import com.sippulse.soapadapter.client.accountGroupWS.AccountGroupWS;
import com.sippulse.soapadapter.client.accountGroupWS.SipPulse;
import com.sippulse.soapadapter.config.soap.properties.SoapProperties;
import com.sippulse.soapadapter.factory.SoapClientFactory;
import jakarta.xml.ws.BindingProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URL;

@Configuration
public class AccountGroupWSConfig {

    @Bean
    public AccountGroupWS accountGroupWS(SoapProperties properties, SoapClientFactory factory) {
        return factory.createClient(
                properties.getEndpoints().getAccountGroup(),
                SipPulse::new,
                SipPulse::getAccountGroupWSPort
        );
    }

}
