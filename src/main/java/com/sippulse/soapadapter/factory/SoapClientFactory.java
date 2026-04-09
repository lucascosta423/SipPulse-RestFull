package com.sippulse.soapadapter.factory;

import jakarta.xml.ws.BindingProvider;
import com.sippulse.soapadapter.exception.SoapServiceException;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.net.URL;
import java.util.function.Function;

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


@Component
public class SoapClientFactory {

    public <T, S> T createClient(
            String baseUrl,
            Function<URL, S> serviceFactory,
            Function<S, T> portExtractor
    ) {
        try {
            URI uri = URI.create(baseUrl + "?wsdl");
            URL wsdlUrl = uri.toURL();

            S service = serviceFactory.apply(wsdlUrl);
            T port = portExtractor.apply(service);

            configure((BindingProvider) port, baseUrl);

            return port;
        } catch (Exception e) {
            throw new SoapServiceException("Erro ao criar client SOAP", e);
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
