package com.sippulse.soapadapter.adapter;

import com.sippulse.soapadapter.client.customerWS.CustomerWS;
import com.sippulse.soapadapter.client.customerWS.SubscriberDTO;
import com.sippulse.soapadapter.client.customerWS.WSException;
import org.springframework.stereotype.Component;

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
            throw new RuntimeException("Erro ao alterar senha do cliente", e);
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
            throw new RuntimeException("Erro ao recuperar saldo do cliente",e);
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
            throw new RuntimeException("Erro ao autenticar cliente",e);
        }
    }


}
