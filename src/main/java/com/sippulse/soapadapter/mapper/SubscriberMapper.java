package com.sippulse.soapadapter.mapper;

import com.sippulse.soapadapter.client.subscriberWS.SubscriberDTO;
import com.sippulse.soapadapter.dto.SubscriberMinDTO;
import org.springframework.stereotype.Component;

@Component
public class SubscriberMapper {
    public SubscriberDTO toSoap(SubscriberMinDTO subscriberMinDTO){
        if (subscriberMinDTO == null) return null;

        SubscriberDTO subscriber = new SubscriberDTO();

        subscriber.setUsername(subscriberMinDTO.username());
        subscriber.setEmailAddress(subscriberMinDTO.emailAddress());
        subscriber.setPassword(subscriberMinDTO.password());
        subscriber.setPasswordPortal(subscriberMinDTO.passwordPortal());
        subscriber.setDomain(subscriberMinDTO.domain());

        subscriber.setProfile(subscriberMinDTO.profile());
        subscriber.setRatePlanId(subscriberMinDTO.ratePlanId());
        subscriber.setCountryCode(subscriberMinDTO.countryCode());
        subscriber.setRpid(subscriberMinDTO.rpid());
        subscriber.setAreaCode(subscriberMinDTO.areaCode());
        subscriber.setCallLimit(subscriberMinDTO.callLimit());
        subscriber.setActiveIncomingCalls(subscriberMinDTO.activeIncomingCalls());
        subscriber.setActiveOutgoingCalls(subscriberMinDTO.activeOutgoingCalls());
        subscriber.setCallsOnlyByIp(subscriberMinDTO.callsOnlyByIp());
        subscriber.setVoicemail(subscriberMinDTO.voicemail());

        subscriber.setContractNumber(subscriberMinDTO.contractNumber());
        subscriber.setDocument(subscriberMinDTO.document());
        subscriber.setFirstName(subscriberMinDTO.firstName());
        subscriber.setLastName(subscriberMinDTO.lastName());
        subscriber.setMobile(subscriberMinDTO.mobile());
        subscriber.setPhone(subscriberMinDTO.phone());
        subscriber.setAddress(subscriberMinDTO.address());
        subscriber.setCity(subscriberMinDTO.city());
        subscriber.setComplement(subscriberMinDTO.complement());
        subscriber.setNumber(subscriberMinDTO.number());
        subscriber.setQuarter(subscriberMinDTO.quarter());
        subscriber.setState(subscriberMinDTO.state());
        subscriber.setZip(subscriberMinDTO.zip());

        subscriber.setResellerId(0);

        return subscriber;
    }
}
