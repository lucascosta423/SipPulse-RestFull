package com.sippulse.soapadapter.config.WSconfig;

import com.sippulse.soapadapter.client.userLocationWS.SipPulse;
import com.sippulse.soapadapter.client.userLocationWS.UserLocationWS;

import com.sippulse.soapadapter.config.soap.SoapProperties;
import jakarta.xml.ws.BindingProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URL;

@Configuration
public class UserLocationWSConfig {

    @Bean
    public UserLocationWS userLocationWS(SoapProperties properties) {
        try {
            String baseUrl = properties.getEndpoints().get("user_location");

            URL wsdlUrl = new URL(baseUrl + "?wsdl");

            SipPulse service = new SipPulse(wsdlUrl);

            UserLocationWS port = service.getUserLocationWSPort();

            configure((BindingProvider) port, baseUrl);

            return port;
        } catch (Exception e) {
            throw new RuntimeException("Erro ao criar UserLocationWS", e);
        }
    }

    private void configure(BindingProvider bp, String baseUrl) {
        bp.getRequestContext().put(
                BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                baseUrl
        );
        bp.getRequestContext().put("com.sun.xml.ws.connect.timeout", 5000);
        bp.getRequestContext().put("com.sun.xml.ws.request.timeout", 10000);
    }
}
