package com.sippulse.soapadapter.service;

import com.sippulse.soapadapter.adapter.WhitelistClientAdapter;
import com.sippulse.soapadapter.client.whitelistWS.UserPrincipalDTO;
import com.sippulse.soapadapter.client.whitelistWS.UserWhiteList;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WhitelistService {

    private final WhitelistClientAdapter adapter;

    public WhitelistService(WhitelistClientAdapter adapter) {
        this.adapter = adapter;
    }

    public List<UserWhiteList> listWhiteList(String username, String domain, UserPrincipalDTO principal) {
        return adapter.listWhiteList(username, domain, principal);
    }

    public Integer insertWhiteList(UserWhiteList whiteList, UserPrincipalDTO principal) {
        return adapter.insertWhiteList(whiteList, principal);
    }

    public void deleteWhiteList(Integer whiteListId, UserPrincipalDTO principal) {
        adapter.deleteWhiteList(whiteListId, principal);
    }
}
