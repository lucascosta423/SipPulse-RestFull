package com.sippulse.soapadapter.adapter;

import com.sippulse.soapadapter.client.addressWS.Address;
import com.sippulse.soapadapter.client.addressWS.AddressWS;
import com.sippulse.soapadapter.client.addressWS.UserPrincipalDTO;
import com.sippulse.soapadapter.client.addressWS.WSException;
import com.sippulse.soapadapter.mapper.SoapAuthMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AddressClientAdpter{
    private final AddressWS addressWS;
    private final SoapAuthMapper authMapper;

    public AddressClientAdpter(AddressWS addressWS, SoapAuthMapper authMapper) {
        this.addressWS = addressWS;
        this.authMapper = authMapper;
    }

    public Address insertAddress(Address address)  {
        try{
           return addressWS.insertAddress(
                   address,
                   authMapper.toSoapUser(UserPrincipalDTO::new)
           );
        }catch (WSException e){
            throw new RuntimeException("Error entering address.",e);
        }
    }

    public Address updateAddress(Address address)  {
        try{
            return addressWS.updateAddress(
                    address,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new RuntimeException("Error updating address",e);
        }
    }

    public void removeAddress(String domain, Integer addressId)  {
        try{
            addressWS.removeAddress(
                    domain,
                    addressId,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new RuntimeException("Error removing address",e);
        }
    }

    public List<Address> lisAddresses(String username, String domain)  {
        try{
            return addressWS.lisAddresses(
                    username,
                    domain,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new RuntimeException("Error listing addresses.",e);
        }
    }
}
