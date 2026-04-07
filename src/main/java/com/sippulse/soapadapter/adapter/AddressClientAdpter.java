package com.sippulse.soapadapter.adapter;

import com.sippulse.soapadapter.exception.SoapServiceException;
import com.sippulse.soapadapter.client.addressWS.Address;
import com.sippulse.soapadapter.client.addressWS.AddressWS;
import com.sippulse.soapadapter.client.addressWS.UserPrincipalDTO;
import com.sippulse.soapadapter.client.addressWS.WSException;
import com.sippulse.soapadapter.mapper.SoapAuthMapper;
import org.springframework.stereotype.Component;

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
                   authMapper.toSoapUser(new UserPrincipalDTO())
           );
        }catch (WSException e){
            throw new SoapServiceException("Error entering address.",e);
        }
    }

    public Address updateAddress(Address address)  {
        try{
            return addressWS.updateAddress(
                    address,
                    authMapper.toSoapUser(new UserPrincipalDTO())
            );
        }catch (WSException e){
            throw new SoapServiceException("Error updating address",e);
        }
    }

    public void removeAddress(String domain, Integer addressId)  {
        try{
            addressWS.removeAddress(
                    domain,
                    addressId,
                    authMapper.toSoapUser(new UserPrincipalDTO())
            );
        }catch (WSException e){
            throw new SoapServiceException("Error removing address",e);
        }
    }

    public List<Address> lisAddresses(String username, String domain)  {
        try{
            return addressWS.lisAddresses(
                    username,
                    domain,
                    authMapper.toSoapUser(new UserPrincipalDTO())
            );
        }catch (WSException e){
            throw new SoapServiceException("Error listing addresses.",e);
        }
    }
}
