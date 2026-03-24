package com.sippulse.soapadapter.config.soap;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableConfigurationProperties(SoapAuthProperties.class)
@Configuration
public class SoapConfig {

    @Bean
    public SoapCredentials sipPulseCredentials(SoapAuthProperties properties) {

        return new SoapCredentials(
                properties.getLogin(),
                properties.getPassword()
        );
    }
}
