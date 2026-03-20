package com.sippulse.soapadapter.facade;

import com.sippulse.soapadapter.dto.DidDTO;
import com.sippulse.soapadapter.dto.SubscriberMinDTO;
import com.sippulse.soapadapter.service.DidService;
import com.sippulse.soapadapter.service.SubscriberService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SipPulseFacade {

    private final DidService service;
    private final SubscriberService subscriberService;

    public SipPulseFacade(DidService service, SubscriberService subscriberService) {
        this.service = service;
        this.subscriberService = subscriberService;
    }

    public Integer insertSubscriber(SubscriberMinDTO subscriber){

        return subscriberService.insertSubscriber(subscriber);
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
