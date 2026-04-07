package com.sippulse.soapadapter.mapper;

import com.sippulse.soapadapter.client.subscriberWS.SubscriberServicesDTO;
import com.sippulse.soapadapter.dto.SubscriberMinDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UpdateSubscriberMapper {

    @Mapping(source = "emailAddress", target = "email")
    SubscriberServicesDTO toSoap(SubscriberMinDTO dto);
}
