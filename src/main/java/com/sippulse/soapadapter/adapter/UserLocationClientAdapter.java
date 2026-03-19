package com.sippulse.soapadapter.adapter;

import com.sippulse.soapadapter.client.userLocationWS.*;
import com.sippulse.soapadapter.mapper.SipPulseAuthMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserLocationClientAdapter {

    private final UserLocationWS userLocationWS;
    private final SipPulseAuthMapper authMapper;

    public UserLocationClientAdapter(UserLocationWS userLocationWS, SipPulseAuthMapper authMapper) {
        this.userLocationWS = userLocationWS;
        this.authMapper = authMapper;
    }

    public List<UserLocationDTO> listUserLocations(String username, String domain, UserPrincipalDTO principal) {
        try {
            return userLocationWS.listUserLocations(
                    username,
                    domain,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        } catch (WSException e) {
            throw new RuntimeException("Erro ao listar localizações do usuário", e);
        }
    }

    public void addUserLocation(String username, String domain, String contact, UserPrincipalDTO principal) {
        try {
            userLocationWS.addUserLocation(
                    username,
                    domain,
                    contact,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        } catch (WSException e) {
            throw new RuntimeException("Erro ao adicionar localização do usuário", e);
        }
    }

    public void removeUserLocation(String username, String domain, String contact, UserPrincipalDTO principal) {
        try {
            userLocationWS.removeUserLocation(
                    username,
                    domain,
                    contact,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        } catch (WSException e) {
            throw new RuntimeException("Erro ao remover localização do usuário", e);
        }
    }
}
