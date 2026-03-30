package com.sippulse.soapadapter.mapper;

import com.sippulse.soapadapter.client.subscriberWS.SubscriberServicesDTO;
import com.sippulse.soapadapter.dto.SubscriberMinDTO;
import org.springframework.stereotype.Component;

@Component
public class UpdateSubscriberMapper {
    public SubscriberServicesDTO toSoap(SubscriberMinDTO subscriberMinDTO){

        if (subscriberMinDTO == null) return null;

        SubscriberServicesDTO subscriber = new SubscriberServicesDTO();

        subscriber.setUsername(subscriberMinDTO.username());
        subscriber.setDomain(subscriberMinDTO.domain());
        subscriber.setEmail(subscriberMinDTO.emailAddress());
        subscriber.setCountryCode(subscriberMinDTO.countryCode());
        subscriber.setRpid(subscriberMinDTO.rpid());
        subscriber.setAreaCode(subscriberMinDTO.areaCode());
        subscriber.setCallLimit(subscriberMinDTO.callLimit());
        subscriber.setCps(subscriberMinDTO.cps());
        subscriber.setKeepAlive(subscriberMinDTO.keepAlive());

        return subscriber;

    }
}
