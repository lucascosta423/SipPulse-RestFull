package com.sippulse.soapadapter.mapper;


import com.sippulse.soapadapter.config.soap.auth.SoapCredentials;
import com.sippulse.soapadapter.exception.SoapServiceException;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Applies SOAP authentication credentials to DTOs from any client package.
 * Caches reflection Method lookups by class to avoid overhead on repeated calls.
 */
@Component
public class SoapAuthMapper {

    private final SoapCredentials credentials;
    private final ConcurrentHashMap<Class<?>, Method[]> methodCache = new ConcurrentHashMap<>();

    public SoapAuthMapper(SoapCredentials credentials) {
        this.credentials = credentials;
    }

    public <T> T toSoapUser(T dto) {
        if (dto == null) {
            throw new SoapServiceException("DTO cannot be null");
        }

        Method[] methods = methodCache.computeIfAbsent(dto.getClass(), this::resolveAuthMethods);

        try {
            methods[0].invoke(dto, credentials.login());
            methods[1].invoke(dto, credentials.password());
        } catch (Exception e) {
            throw new SoapServiceException("Failed to apply auth to %s".formatted(dto.getClass().getName()), e);
        }

        return dto;
    }

    private Method[] resolveAuthMethods(Class<?> clazz) {
        try {
            Method setLogin = clazz.getMethod("setLogin", String.class);
            Method setPassword = clazz.getMethod("setPassword", String.class);
            return new Method[]{setLogin, setPassword};
        } catch (NoSuchMethodException e) {
            throw new SoapServiceException(
                    "%s must have setLogin(String) and setPassword(String) methods".formatted(clazz.getName()), e);
        }
    }
}