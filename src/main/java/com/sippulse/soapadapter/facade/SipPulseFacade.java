package com.sippulse.soapadapter.facade;

import com.sippulse.soapadapter.dto.DidDTO;
import com.sippulse.soapadapter.dto.SubscriberMinDTO;
import com.sippulse.soapadapter.service.DidService;
import com.sippulse.soapadapter.service.SubscriberService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

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

    public Map<String, Integer> insertSubscriberWithDid(SubscriberMinDTO subscriber) {

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

        Integer didID = didService.insertDid(didDTO);

        return Map.of(
                "SubscriberID",subscriberID,
                "DidID",didID
        );

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
