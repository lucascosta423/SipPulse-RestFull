package com.sippulse.soapadapter.service;

import com.sippulse.soapadapter.adapter.CustomerClientAdapter;
import com.sippulse.soapadapter.client.customerWS.SubscriberDTO;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerClientAdapter adapter;

    public CustomerService(CustomerClientAdapter adapter) {
        this.adapter = adapter;
    }

    public void changeCustomerPassword(String username, String domain, String actualPassword, String newPassword, String confirmNewPassword) {
        adapter.changeCustomerPassword(username, domain, actualPassword, newPassword, confirmNewPassword);
    }

    public Double retrieveCustomerCredit(String username, String password, String domain) {
        return adapter.retrieveCustomerCredit(
                username,
                password,
                domain
        );
    }


    public SubscriberDTO authenticate(String username, String domain, String password) {
        return adapter.authenticate(
                username,
                password,
                domain
        );

    }
}
