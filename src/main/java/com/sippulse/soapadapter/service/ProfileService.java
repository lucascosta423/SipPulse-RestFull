package com.sippulse.soapadapter.service;

import com.sippulse.soapadapter.adapter.ProfileClientAdapter;
import com.sippulse.soapadapter.client.profileWS.Profile;
import com.sippulse.soapadapter.client.profileWS.UserPrincipalDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {

    private final ProfileClientAdapter adapter;

    public ProfileService(ProfileClientAdapter adapter) {
        this.adapter = adapter;
    }

    public List<Profile> listProfilesByDomain(String domain) {
        return adapter.listProfilesByDomain(domain);
    }
}
