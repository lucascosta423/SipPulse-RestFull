package com.sippulse.soapadapter.adapter;

import com.sippulse.soapadapter.exception.SoapServiceException;
import com.sippulse.soapadapter.client.profileWS.*;
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
public class ProfileClientAdapter {

    private final ProfileWS profileWS;
    private final SoapAuthMapper authMapper;

    public ProfileClientAdapter(ProfileWS profileWS, SoapAuthMapper authMapper) {
        this.profileWS = profileWS;
        this.authMapper = authMapper;
    }

    public List<Profile> listProfilesByDomain(String domain) {
        try {
            return profileWS.listProfilesByDomain(
                    domain,
                    authMapper.toSoapUser(new UserPrincipalDTO())
            );
        } catch (WSException e) {
            throw new SoapServiceException("Erro ao listar profiles por domínio", e);
        }
    }
}
