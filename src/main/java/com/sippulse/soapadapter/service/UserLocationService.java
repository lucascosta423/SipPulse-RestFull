package com.sippulse.soapadapter.service;

import com.sippulse.soapadapter.adapter.UserLocationClientAdapter;
import com.sippulse.soapadapter.client.userLocationWS.UserLocationDTO;
import com.sippulse.soapadapter.client.userLocationWS.UserPrincipalDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserLocationService {

    private final UserLocationClientAdapter adapter;

    public UserLocationService(UserLocationClientAdapter adapter) {
        this.adapter = adapter;
    }

    public List<UserLocationDTO> listUserLocations(String username, String domain, UserPrincipalDTO principal) {
        return adapter.listUserLocations(username, domain, principal);
    }

    public void addUserLocation(String username, String domain, String contact, UserPrincipalDTO principal) {
        adapter.addUserLocation(username, domain, contact, principal);
    }

    public void removeUserLocation(String username, String domain, String contact, UserPrincipalDTO principal) {
        adapter.removeUserLocation(username, domain, contact, principal);
    }
}
