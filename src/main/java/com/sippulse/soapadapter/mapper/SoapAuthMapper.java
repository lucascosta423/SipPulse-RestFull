package com.sippulse.soapadapter.mapper;


import com.sippulse.soapadapter.config.soap.auth.SoapCredentials;
import org.springframework.stereotype.Component;

import java.util.function.Supplier;

@Component
public class SoapAuthMapper {

    private final SoapCredentials credentials;

    public SoapAuthMapper(SoapCredentials credentials) {
        this.credentials = credentials;
    }

    public <T> T toSoapUser(Supplier<T> supplier) {

        T dto = supplier.get();

        try {
            dto.getClass().getMethod("setLogin", String.class)
                    .invoke(dto, credentials.login());

            dto.getClass().getMethod("setPassword", String.class)
                    .invoke(dto, credentials.password());

        } catch (Exception e) {
            throw new RuntimeException("Erro ao mapear UserPrincipalDTO", e);
        }

        return dto;
    }
}
