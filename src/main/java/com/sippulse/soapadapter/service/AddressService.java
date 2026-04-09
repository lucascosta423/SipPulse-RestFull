package com.sippulse.soapadapter.service;

import com.sippulse.soapadapter.adapter.AddressClientAdpter;
import com.sippulse.soapadapter.client.addressWS.Address;
import com.sippulse.soapadapter.dto.AddressDTO;
import com.sippulse.soapadapter.mapper.AddressMapper;
import com.sippulse.soapadapter.utils.AccountCodeUtils;
import org.springframework.stereotype.Service;

import java.util.List;

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


@Service
public class AddressService {
    private final AddressClientAdpter addressClientAdpter;
    private final AddressMapper addressMapper;

    public AddressService(AddressClientAdpter addressClientAdpter, AddressMapper addressMapper) {
        this.addressClientAdpter = addressClientAdpter;
        this.addressMapper = addressMapper;
    }

    public Address insertAddress(AddressDTO addressDTO) {

        var address = addressMapper.toSoap(addressDTO);

        var ac = AccountCodeUtils.from(addressDTO.account());
        address.setUsername(ac.username());
        address.setDomain(ac.domain());

        return addressClientAdpter.insertAddress(address);
    }

    public Address updateAddress(AddressDTO addressDTO) {

        var address = addressMapper.toSoap(addressDTO);

        var ac = AccountCodeUtils.from(addressDTO.account());
        address.setUsername(ac.username());
        address.setDomain(ac.domain());

        return addressClientAdpter.updateAddress(address);
    }

    public void removeAddress(String domain, Integer addressId) {
        addressClientAdpter.removeAddress(domain, addressId);
    }

    public List<Address> listAddresses(String accountcode) {
        var ac = AccountCodeUtils.from(accountcode);

        return addressClientAdpter.lisAddresses(ac.username(), ac.domain());
    }

}
