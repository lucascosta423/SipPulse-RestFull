package com.sippulse.soapadapter.mapper;

import com.sippulse.soapadapter.client.subscriberWS.SubscriberDTO;
import com.sippulse.soapadapter.dto.SubscriberMinDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface SubscriberMapper {

    @Mapping(target = "resellerId", constant = "0")
    SubscriberDTO toSoap(SubscriberMinDTO dto);
}
