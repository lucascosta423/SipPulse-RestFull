package com.sippulse.soapadapter.config.ws;

import com.sippulse.soapadapter.client.didWS.DidWS;
import com.sippulse.soapadapter.client.didWS.SipPulse;
import com.sippulse.soapadapter.config.soap.properties.SoapProperties;
import jakarta.xml.ws.BindingProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URL;

@Configuration
public class DidWSConfig {

        @Bean
        public DidWS didWS(SoapProperties properties) {
            try {
                String baseUrl = properties.getEndpoints().getDid();

                URL wsdlUrl = new URL(baseUrl + "?wsdl");

                SipPulse service = new SipPulse(wsdlUrl);

                DidWS port = service.getDidWSPort();

                configure((BindingProvider) port, baseUrl);

                return port;

            } catch (Exception e) {
                throw new RuntimeException("Erro ao criar DidWS", e);
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
