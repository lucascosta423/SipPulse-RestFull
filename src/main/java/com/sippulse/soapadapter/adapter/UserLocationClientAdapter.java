package com.sippulse.soapadapter.adapter;

import com.sippulse.soapadapter.client.userLocationWS.*;
import com.sippulse.soapadapter.mapper.SoapAuthMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserLocationClientAdapter {

    private final UserLocationWS userLocationWS;
    private final SoapAuthMapper authMapper;

    public UserLocationClientAdapter(UserLocationWS userLocationWS, SoapAuthMapper authMapper) {
        this.userLocationWS = userLocationWS;
        this.authMapper = authMapper;
    }

    public List<UserLocationDTO> listUserLocations(String username, String domain) {
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

    public void addUserLocation(String username, String domain, String contact) {
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

    public void removeUserLocation(String username, String domain, String contact) {
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
