package com.sippulse.soapadapter.service;

import com.sippulse.soapadapter.adapter.AccountGroupClientAdapter;
import com.sippulse.soapadapter.client.accountGroupWS.AccountGroupDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountGroupService {

    private final AccountGroupClientAdapter adapter;

    public AccountGroupService(AccountGroupClientAdapter adapter) {
        this.adapter = adapter;
    }

    public AccountGroupDTO retrieveAccountGroup(String accountManager) {
        return adapter.retrieveAccountGroup(accountManager);
    }

    public void addAccountGroup(String accountManager, String managerProfile, List<String> account) {
        adapter.addAccountGroup(accountManager, managerProfile, account);
    }

    public void removeAccountGroup(String accountManager, String managerProfile, List<String> account) {
        adapter.removeAccountGroup(accountManager, managerProfile, account);
    }
}
