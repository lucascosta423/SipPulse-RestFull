package com.sippulse.soapadapter.service;

import com.sippulse.soapadapter.adapter.ReloadModuleClientAdpter;
import com.sippulse.soapadapter.client.reloadWS.UserPrincipalDTO;
import com.sippulse.soapadapter.utils.AccountCodeUtils;
import org.springframework.stereotype.Service;

@Service
public class ReloadModuleService {

    private final ReloadModuleClientAdpter adapter;

    public ReloadModuleService(ReloadModuleClientAdpter adapter) {
        this.adapter = adapter;
    }

    public void reloadProfile(String profile, String domain) {
        adapter.reloadProfile(profile, domain);
    }

    public void reloadSubscriber(String accountcode) {
        AccountCodeUtils ac = AccountCodeUtils.from(accountcode);
        adapter.reloadSubscriber(ac.username(), ac.domain());
    }

    public void reloadDid(Integer didId) {
        adapter.reloadDid(didId);
    }

    public void reloadAddress() {
        adapter.reloadAddress();
    }

    public void reloadHuntGroup(Integer huntGroupId) {
        adapter.reloadHuntGroup(huntGroupId);
    }
}
