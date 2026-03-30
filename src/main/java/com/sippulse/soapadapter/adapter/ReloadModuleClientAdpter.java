package com.sippulse.soapadapter.adapter;

import com.sippulse.soapadapter.client.reloadWS.ReloadModulesWS;
import com.sippulse.soapadapter.client.reloadWS.UserPrincipalDTO;
import com.sippulse.soapadapter.client.reloadWS.WSException;
import com.sippulse.soapadapter.mapper.SoapAuthMapper;
import org.springframework.stereotype.Component;

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


@Component
public class ReloadModuleClientAdpter{
    private final ReloadModulesWS reloadModulesWS;
    private final SoapAuthMapper authMapper;

    public ReloadModuleClientAdpter(ReloadModulesWS reloadModulesWS, SoapAuthMapper authMapper) {
        this.reloadModulesWS = reloadModulesWS;
        this.authMapper = authMapper;
    }

    
    public void reloadProfile(String profile, String domain) {
        try{
            reloadModulesWS.reloadProfile(
                    profile,
                    domain,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new RuntimeException("Error reloading profile", e);
        }
    }

    
    public void reloadSubscriber(String username, String domain){
        try{
            reloadModulesWS.reloadSubscriber(
                    username,
                    domain,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new RuntimeException("Error reloading subscriber", e);
        }
    }

    
    public void reloadDid(Integer didId) {
        try {
            reloadModulesWS.reloadDid(
                    didId,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new RuntimeException("Error reloading did", e);
        }
    }

    
    public void reloadAddress() {
        try{
            reloadModulesWS.reloadAddress(
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new RuntimeException("Error reloading address", e);
        }
    }

    
    public void reloadHuntGroup(Integer huntGroupId) {
        try {
            reloadModulesWS.reloadHuntGroup(
                    huntGroupId,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new RuntimeException("Error reloading hunt group", e);
        }
    }
}
