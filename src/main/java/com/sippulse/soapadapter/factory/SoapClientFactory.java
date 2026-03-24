package com.sippulse.soapadapter.factory;

import jakarta.xml.ws.BindingProvider;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.net.URL;
import java.util.function.Function;

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
            throw new RuntimeException("Erro ao criar client SOAP", e);
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
