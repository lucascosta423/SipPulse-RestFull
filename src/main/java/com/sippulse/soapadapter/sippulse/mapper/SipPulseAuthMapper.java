package com.sippulse.soapadapter.sippulse.mapper;


import com.sippulse.soapadapter.sippulse.config.SipPulseCredentials;
import org.springframework.stereotype.Component;

import java.util.function.Supplier;

@Component
public class SipPulseAuthMapper {

    private final SipPulseCredentials credentials;

    public SipPulseAuthMapper(SipPulseCredentials credentials) {
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
