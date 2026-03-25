package com.sippulse.soapadapter.dto;

public record AddressDTO (
        String account,
        String ipAddress,
        Integer mask,
        String method,
        Integer port,
        String protocol,
        String techPrefix
){
}
