package com.sippulse.soapadapter.adapter;


import com.sippulse.soapadapter.exception.SoapServiceException;
import com.sippulse.soapadapter.client.didWS.Did;
import com.sippulse.soapadapter.client.didWS.DidWS;
import com.sippulse.soapadapter.client.didWS.UserPrincipalDTO;
import com.sippulse.soapadapter.client.didWS.WSException;
import com.sippulse.soapadapter.dto.DidDTO;
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
public class DidClientAdapter {
    private final DidWS didWS;
    private final SoapAuthMapper authMapper;

    public DidClientAdapter(DidWS didWS, SoapAuthMapper authMapper) {
        this.didWS = didWS;
        this.authMapper = authMapper;
    }

    public Integer insertDid(Did did){
        try{
            return didWS.insertDid(did,authMapper.toSoapUser(UserPrincipalDTO::new));
        }catch (WSException e){
            throw new SoapServiceException("Erro ao inserir DID", e);
        }
    }

    public List<String> listAvailablesNumbers(String domain){
        try {
            return didWS.listAvailablesNumbers(
                    domain,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        } catch (WSException e) {
            throw new SoapServiceException("Erro ao buscar números disponíveis", e);
        }
    }

    public List<DidDTO> listByAcc(String accountCode){
        try{
            return DidDTO.fromEntityList(
                    didWS.listByAcc(
                            accountCode,
                            authMapper.toSoapUser(UserPrincipalDTO::new)
                    )
            );

        }catch (WSException e){
            throw new SoapServiceException("Erro ao buscar DIDs", e);
        }
    }

    public void deleteDid(Integer didId ) {

        try{

            didWS.deleteDid(
                    didId,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );

        }catch (WSException e){
            throw new SoapServiceException("Erro ao deletar did", e);
        }
    }
}
