package com.sippulse.soapadapter.adapter;

import com.sippulse.soapadapter.exception.SoapServiceException;
import com.sippulse.soapadapter.client.huntGroupWS.*;
import com.sippulse.soapadapter.mapper.SoapAuthMapper;
import jakarta.xml.ws.Holder;
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
public class HuntGroupClientAdapter {

    private final HuntGroupWS huntGroupWS;
    private final SoapAuthMapper authMapper;

    public HuntGroupClientAdapter(HuntGroupWS huntGroupWS, SoapAuthMapper authMapper) {
        this.huntGroupWS = huntGroupWS;
        this.authMapper = authMapper;
    }

    public List<HuntGroup> listHuntGroups(String domain, UserPrincipalDTO principal) {
        try {
            return huntGroupWS.listHuntGroups(
                    domain,
                    authMapper.toSoapUser(new UserPrincipalDTO())
            );
        } catch (WSException e) {
            throw new SoapServiceException("Erro ao listar hunt groups", e);
        }
    }

    public void insertHuntGroup(HuntGroup huntGroup, UserPrincipalDTO principal) {
        try {
            Holder<HuntGroup> holder = new Holder<>(huntGroup);
            huntGroupWS.insertHuntGroup(
                    holder,
                    authMapper.toSoapUser(new UserPrincipalDTO())
            );
        } catch (WSException e) {
            throw new SoapServiceException("Erro ao inserir hunt group", e);
        }
    }

    public void updateHuntGroup(HuntGroup huntGroup, UserPrincipalDTO principal) {
        try {
            Holder<HuntGroup> holder = new Holder<>(huntGroup);
            huntGroupWS.updateHuntGroup(
                    holder,
                    authMapper.toSoapUser(new UserPrincipalDTO())
            );
        } catch (WSException e) {
            throw new SoapServiceException("Erro ao atualizar hunt group", e);
        }
    }

    public void removeHuntGroup(String domain, Integer huntGroupId, UserPrincipalDTO principal) {
        try {
            huntGroupWS.removeHuntGroup(
                    domain,
                    huntGroupId,
                    authMapper.toSoapUser(new UserPrincipalDTO())
            );
        } catch (WSException e) {
            throw new SoapServiceException("Erro ao remover hunt group", e);
        }
    }
}
