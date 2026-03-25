package com.sippulse.soapadapter.service;

import com.sippulse.soapadapter.adapter.AddressClientAdpter;
import com.sippulse.soapadapter.client.addressWS.Address;
import com.sippulse.soapadapter.dto.AddressDTO;
import com.sippulse.soapadapter.mapper.AddressMapper;
import com.sippulse.soapadapter.utils.AccountCodeUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<Address> lisAddresses(String accountcode) {
        var ac = AccountCodeUtils.from(accountcode);

        return addressClientAdpter.lisAddresses(ac.username(), ac.domain());
    }

}
