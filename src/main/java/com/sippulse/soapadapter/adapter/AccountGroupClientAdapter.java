package com.sippulse.soapadapter.adapter;

import com.sippulse.soapadapter.client.accountGroupWS.*;
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
public class AccountGroupClientAdapter {

    private final AccountGroupWS accountGroupWS;
    private final SoapAuthMapper authMapper;

    public AccountGroupClientAdapter(AccountGroupWS accountGroupWS, SoapAuthMapper authMapper) {
        this.accountGroupWS = accountGroupWS;
        this.authMapper = authMapper;
    }

    public AccountGroupDTO retrieveAccountGroup(String accountManager) {
        try {
            return accountGroupWS.retrieveAccountGroup(
                    accountManager,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        } catch (WSException e) {
            throw new RuntimeException("Erro ao recuperar account group", e);
        }
    }

    public void addAccountGroup(String accountManager, String managerProfile, List<String> account) {
        try {
            accountGroupWS.addAccountGroup(
                    accountManager,
                    managerProfile,
                    account,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        } catch (WSException e) {
            throw new RuntimeException("Erro ao adicionar account group", e);
        }
    }

    public void removeAccountGroup(String accountManager, String managerProfile, List<String> account) {
        try {
            accountGroupWS.removeAccountGroup(
                    accountManager,
                    managerProfile,
                    account,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        } catch (WSException e) {
            throw new RuntimeException("Erro ao remover account group", e);
        }
    }
}
