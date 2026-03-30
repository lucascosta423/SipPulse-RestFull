package com.sippulse.soapadapter.config.ws;


import com.sippulse.soapadapter.client.subscriberWS.SipPulse;
import com.sippulse.soapadapter.client.subscriberWS.SubscriberWS;
import com.sippulse.soapadapter.config.soap.properties.SoapProperties;
import jakarta.xml.ws.BindingProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URL;

/**
 * SipPulse-RestFull
 * Copyright (C) 2026
 * <p>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <a href="https://www.gnu.org/licenses/">gnu</a>.
 */


@Configuration
public class SubscriberWSConfig {

    @Bean
    public SubscriberWS subscriberWS(SoapProperties properties) {
        try {
            String baseUrl = properties.getEndpoints().getSubscriber();

            URL wsdlUrl = new URL(baseUrl + "?wsdl");

            SipPulse service = new SipPulse(wsdlUrl);

            SubscriberWS port = service.getSubscriberWSPort();

            configure((BindingProvider) port, baseUrl);

            return port;

        } catch (Exception e) {
            throw new RuntimeException("Erro ao criar SubscriberWS", e);
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
