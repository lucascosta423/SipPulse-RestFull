package com.sippulse.soapadapter.service;

import com.sippulse.soapadapter.adapter.HuntGroupClientAdapter;
import com.sippulse.soapadapter.client.huntGroupWS.HuntGroup;
import com.sippulse.soapadapter.client.huntGroupWS.UserPrincipalDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HuntGroupService {

    private final HuntGroupClientAdapter adapter;

    public HuntGroupService(HuntGroupClientAdapter adapter) {
        this.adapter = adapter;
    }

    public List<HuntGroup> listHuntGroups(String domain, UserPrincipalDTO principal) {
        return adapter.listHuntGroups(domain, principal);
    }

    public void insertHuntGroup(HuntGroup huntGroup, UserPrincipalDTO principal) {
        adapter.insertHuntGroup(huntGroup, principal);
    }

    public void updateHuntGroup(HuntGroup huntGroup, UserPrincipalDTO principal) {
        adapter.updateHuntGroup(huntGroup, principal);
    }

    public void removeHuntGroup(String domain, Integer huntGroupId, UserPrincipalDTO principal) {
        adapter.removeHuntGroup(domain, huntGroupId, principal);
    }
}
