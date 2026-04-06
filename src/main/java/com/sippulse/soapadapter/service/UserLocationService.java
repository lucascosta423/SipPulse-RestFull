package com.sippulse.soapadapter.service;

import com.sippulse.soapadapter.adapter.UserLocationClientAdapter;
import com.sippulse.soapadapter.client.userLocationWS.UserLocationDTO;
import org.springframework.stereotype.Service;

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
