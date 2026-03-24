package com.sippulse.soapadapter.adapter;

import com.sippulse.soapadapter.client.accountGroupWS.*;
import com.sippulse.soapadapter.mapper.SoapAuthMapper;
import org.springframework.stereotype.Component;

import java.util.List;

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
