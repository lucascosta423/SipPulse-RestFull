package com.sippulse.soapadapter.config.ws;

import com.sippulse.soapadapter.client.rateWS.RateWS;
import com.sippulse.soapadapter.client.rateWS.SipPulse;
import com.sippulse.soapadapter.config.soap.properties.SoapProperties;
import com.sippulse.soapadapter.factory.SoapClientFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RateWSConfig {

    @Bean
    public RateWS rateWS(SoapProperties properties, SoapClientFactory factory){
        return factory.createClient(
                properties.getEndpoints().getRate(),
                SipPulse::new,
                SipPulse::getRateWSPort
        );
    }

}
