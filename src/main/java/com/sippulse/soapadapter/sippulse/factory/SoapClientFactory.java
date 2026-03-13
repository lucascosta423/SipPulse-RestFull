package com.sippulse.soapadapter.sippulse.factory;

import jakarta.xml.ws.BindingProvider;
import org.springframework.stereotype.Component;

import java.net.MalformedURLException;
import java.net.URL;

@Component
public class SoapClientFactory {

    public <T> T createClient(String baseUrl, Class<?> serviceClass, String portMethod) {

        try {

            URL wsdlUrl = new URL(baseUrl + "?wsdl");

            Object service = serviceClass
                    .getConstructor(URL.class)
                    .newInstance(wsdlUrl);

            T port = (T) serviceClass
                    .getMethod(portMethod)
                    .invoke(service);

            BindingProvider bindingProvider = (BindingProvider) port;

            bindingProvider.getRequestContext().put(
                    BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                    baseUrl
            );

            bindingProvider.getRequestContext().put(
                    "com.sun.xml.ws.connect.timeout",
                    5000
            );

            bindingProvider.getRequestContext().put(
                    "com.sun.xml.ws.request.timeout",
                    10000
            );

            return port;

        } catch (MalformedURLException e) {
            throw new RuntimeException("URL SOAP inválida: " + baseUrl, e);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao criar SOAP client", e);
        }
    }

}
