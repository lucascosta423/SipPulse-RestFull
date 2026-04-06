package com.sippulse.soapadapter.adapter;

import com.sippulse.soapadapter.exception.SoapServiceException;
import com.sippulse.soapadapter.client.customerWS.CustomerWS;
import com.sippulse.soapadapter.client.customerWS.SubscriberDTO;
import com.sippulse.soapadapter.client.customerWS.WSException;
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
public class CustomerClientAdapter{

    private final CustomerWS customerWS;

    public CustomerClientAdapter(CustomerWS customerWS) {
        this.customerWS = customerWS;
    }

  
    public void changeCustomerPassword(String username, String domain, String actualPassword, String newPassword, String confirmNewPassword)  {
        try{
            customerWS.changeCustomerPassword(
                    username,
                    domain,
                    actualPassword,
                    newPassword,
                    confirmNewPassword
            );
        }catch (WSException e){
            throw new SoapServiceException("Erro ao alterar senha do cliente", e);
        }
    }

  
    public Double retrieveCustomerCredit(String username, String password, String domain)  {
        try{
            return customerWS.retrieveCustomerCredit(
                    username,
                    password,
                    domain
            );
        }catch (WSException e){
            throw new SoapServiceException("Erro ao recuperar saldo do cliente",e);
        }
    }

  
    public SubscriberDTO authenticate(String username, String domain, String password)  {
        try{
            return customerWS.authenticate(
                    username,
                    password,
                    domain
            );
        }catch (WSException e){
            throw new SoapServiceException("Erro ao autenticar cliente",e);
        }
    }


}
