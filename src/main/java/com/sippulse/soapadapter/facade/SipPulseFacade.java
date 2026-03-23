package com.sippulse.soapadapter.facade;

import com.sippulse.soapadapter.dto.DidDTO;
import com.sippulse.soapadapter.dto.SubscriberMinDTO;
import com.sippulse.soapadapter.service.DidService;
import com.sippulse.soapadapter.service.SubscriberService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SipPulseFacade {

    private final DidService didService;
    private final SubscriberService subscriberService;

    public SipPulseFacade(DidService didService, SubscriberService subscriberService) {
        this.didService = didService;
        this.subscriberService = subscriberService;
    }

    public Integer insertSubscriber(SubscriberMinDTO subscriber) {

        Integer subscriberID = subscriberService.insertSubscriber(subscriber);

        subscriberService.updateSubscriberServices(subscriber);

        return subscriberID;

    }

    public Integer insertSubscriberWithDid(SubscriberMinDTO subscriber) {

        Integer subscriberID = subscriberService.insertSubscriber(subscriber);

        subscriberService.updateSubscriberServices(subscriber);

        DidDTO didDTO = new DidDTO(
                subscriber.accountCode(),
                subscriber.username(),
                "",
                true,
                subscriber.domain(),
                "",
                null,
                "",
                0.0,
                false,
                ""

        );

        didService.insertDid(didDTO);

        return subscriberID;

    }

    public void activateSubscriber(String accountcode) {
        subscriberService.activateSubscriber(accountcode);
    }

    public void blockSubscriber(String accountcode) {
        subscriberService.blockSubscriber(accountcode);
    }

    public Integer insertDid(DidDTO did) {
        return didService.insertDid(did);
    }

    public List<String> listAvailablesNumbers(String domain) {
        return didService.listAvailablesNumbers(domain);
    }

    public List<DidDTO> listByAcc(String accountCode) {
        return didService.listByAcc(accountCode);
    }

    public void deleteDid(Integer didId) {
        didService.deleteDid(didId);
    }
}
