package com.sippulse.soapadapter.service;

import com.sippulse.soapadapter.adapter.WhitelistClientAdapter;
import com.sippulse.soapadapter.client.whitelistWS.UserPrincipalDTO;
import com.sippulse.soapadapter.client.whitelistWS.UserWhiteList;
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
