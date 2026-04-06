package com.sippulse.soapadapter.adapter;

import com.sippulse.soapadapter.exception.SoapServiceException;
import com.sippulse.soapadapter.client.userLocationWS.*;
import com.sippulse.soapadapter.mapper.SoapAuthMapper;
import org.springframework.stereotype.Component;

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
            throw new SoapServiceException("Erro ao listar localizações do usuário", e);
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
            throw new SoapServiceException("Erro ao adicionar localização do usuário", e);
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
            throw new SoapServiceException("Erro ao remover localização do usuário", e);
        }
    }
}
