package com.sippulse.soapadapter.mapper;

import com.sippulse.soapadapter.client.addressWS.Address;
import com.sippulse.soapadapter.dto.AddressDTO;
import org.springframework.stereotype.Component;

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
