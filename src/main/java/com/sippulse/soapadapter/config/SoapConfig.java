package com.sippulse.soapadapter.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableConfigurationProperties(SipPulseAuthProperties.class)
@Configuration
public class SoapConfig {

    @Bean
    public SipPulseCredentials sipPulseCredentials(SipPulseAuthProperties properties) {

        return new SipPulseCredentials(
                properties.getLogin(),
                properties.getPassword()
        );
    }
}
