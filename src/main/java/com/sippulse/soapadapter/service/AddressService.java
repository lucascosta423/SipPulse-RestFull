package com.sippulse.soapadapter.service;

import com.sippulse.soapadapter.adapter.AddressClientAdpter;
import com.sippulse.soapadapter.client.addressWS.Address;
import com.sippulse.soapadapter.utils.AccountCodeUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    private final AddressClientAdpter addressClientAdpter;

    public AddressService(AddressClientAdpter addressClientAdpter) {
        this.addressClientAdpter = addressClientAdpter;
    }

    public Address insertAddress(Address address) {
        return addressClientAdpter.insertAddress(address);
    }

    public Address updateAddress(Address address) {
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
