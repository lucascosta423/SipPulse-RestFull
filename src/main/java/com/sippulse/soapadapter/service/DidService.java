package com.sippulse.soapadapter.service;

import com.sippulse.soapadapter.dto.DidDTO;
import com.sippulse.soapadapter.adapter.DidClientAdapter;
import com.sippulse.soapadapter.client.didWS.Did;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

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
