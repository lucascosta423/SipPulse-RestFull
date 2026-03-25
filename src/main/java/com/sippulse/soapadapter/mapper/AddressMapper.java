package com.sippulse.soapadapter.mapper;

import com.sippulse.soapadapter.client.addressWS.Address;
import com.sippulse.soapadapter.dto.AddressDTO;
import org.springframework.stereotype.Component;

@Component
public class AddressMapper {
    public Address toSoap(AddressDTO addressDTO){
        if (addressDTO == null) return null;

        Address address = new Address();

        address.setIpAddress(addressDTO.ipAddress());
        address.setAccount(addressDTO.account());
        address.setMask(addressDTO.mask());
        address.setMethod(addressDTO.method());
        address.setPort(addressDTO.port());
        address.setProtocol(addressDTO.protocol());
        address.setTechPrefix(addressDTO.techPrefix());

        return address;

    }
}
