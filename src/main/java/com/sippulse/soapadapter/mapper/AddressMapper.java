package com.sippulse.soapadapter.mapper;

import com.sippulse.soapadapter.client.addressWS.Address;
import com.sippulse.soapadapter.dto.AddressDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AddressMapper {

    Address toSoap(AddressDTO dto);
}
