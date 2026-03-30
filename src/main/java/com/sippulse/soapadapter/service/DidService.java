package com.sippulse.soapadapter.service;

import com.sippulse.soapadapter.dto.DidDTO;
import com.sippulse.soapadapter.adapter.DidClientAdapter;
import com.sippulse.soapadapter.client.didWS.Did;
import org.springframework.beans.BeanUtils;
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
public class DidService {

    private final DidClientAdapter didClientAdapter;

    public DidService(DidClientAdapter didClientAdapter) {
        this.didClientAdapter = didClientAdapter;
    }

    public Integer insertDid(DidDTO did){

            Did didSoap = new Did();

            BeanUtils.copyProperties(did,didSoap);

            return didClientAdapter.insertDid(didSoap);

    }

    public List<String> listAvailablesNumbers(String domain){

            return didClientAdapter.listAvailablesNumbers(domain);

    }

    public List<DidDTO> listByAcc(String accountCode){

            return  didClientAdapter.listByAcc(accountCode);
    }

    public void deleteDid(Integer didId ) {
            didClientAdapter.deleteDid(didId);
    }
}
