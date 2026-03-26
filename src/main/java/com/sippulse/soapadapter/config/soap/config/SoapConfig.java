package com.sippulse.soapadapter.config.soap.config;

import com.sippulse.soapadapter.config.soap.auth.SoapCredentials;
import com.sippulse.soapadapter.config.soap.properties.SoapAuthProperties;
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
