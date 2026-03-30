package com.sippulse.soapadapter.config.ws;

import com.sippulse.soapadapter.client.ratePlanWS.RatePlanWS;
import com.sippulse.soapadapter.client.ratePlanWS.SipPulse;
import com.sippulse.soapadapter.config.soap.properties.SoapProperties;
import com.sippulse.soapadapter.factory.SoapClientFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RatePlanWSConfig {

    @Bean
    public RatePlanWS ratePlanWS(SoapProperties properties, SoapClientFactory factory) {
        return factory.createClient(
                properties.getEndpoints().getRatePlan(),
                SipPulse::new,
                SipPulse::getRatePlanWSPort
        );
    }

}
