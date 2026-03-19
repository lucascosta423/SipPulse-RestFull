package com.sippulse.soapadapter.facade;

import com.sippulse.soapadapter.dto.DidDTO;
import com.sippulse.soapadapter.service.DidService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SipPulseFacade {

    private final DidService service;

    public SipPulseFacade(DidService service) {
        this.service = service;
    }

    public Integer insertDid(DidDTO did){

        return service.insertDid(did);

    }

    public List<String> listAvailablesNumbers(String domain){

        return service.listAvailablesNumbers(domain);

    }

    public List<DidDTO> listByAcc(String accountCode){

        return  service.listByAcc(accountCode);
    }

    public void deleteDid(Integer didId ) {
        service.deleteDid(didId);
    }
}
