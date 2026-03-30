package com.sippulse.soapadapter.service;

import com.sippulse.soapadapter.adapter.ReloadModuleClientAdpter;
import com.sippulse.soapadapter.client.reloadWS.UserPrincipalDTO;
import com.sippulse.soapadapter.utils.AccountCodeUtils;
import org.springframework.stereotype.Service;

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
