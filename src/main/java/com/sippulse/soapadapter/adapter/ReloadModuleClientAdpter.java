package com.sippulse.soapadapter.adapter;

import com.sippulse.soapadapter.client.reloadWS.ReloadModulesWS;
import com.sippulse.soapadapter.client.reloadWS.UserPrincipalDTO;
import com.sippulse.soapadapter.client.reloadWS.WSException;
import com.sippulse.soapadapter.mapper.SoapAuthMapper;
import org.springframework.stereotype.Component;

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
