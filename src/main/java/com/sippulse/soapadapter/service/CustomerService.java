package com.sippulse.soapadapter.service;

import com.sippulse.soapadapter.adapter.CustomerClientAdapter;
import com.sippulse.soapadapter.client.customerWS.SubscriberDTO;
import org.springframework.stereotype.Service;

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
