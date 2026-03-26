package com.sippulse.soapadapter.config.ws;


import com.sippulse.soapadapter.client.customerWS.CustomerWS;
import com.sippulse.soapadapter.client.customerWS.SipPulse;
import com.sippulse.soapadapter.config.soap.properties.SoapProperties;
import com.sippulse.soapadapter.factory.SoapClientFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerWSConfig {

    @Bean
    public CustomerWS customerWS(SoapProperties properties, SoapClientFactory factory){
        return factory.createClient(
                properties.getEndpoints().getCustomer(),
                SipPulse::new,
                SipPulse::getCustomerWSPort
        );
    }

}
