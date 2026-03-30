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

    public List<UserLocationDTO> listUserLocations(String username, String domain) {
        return adapter.listUserLocations(username, domain);
    }

    public void addUserLocation(String username, String domain, String contact) {
        adapter.addUserLocation(username, domain, contact);
    }

    public void removeUserLocation(String username, String domain, String contact) {
        adapter.removeUserLocation(username, domain, contact);
    }
}
