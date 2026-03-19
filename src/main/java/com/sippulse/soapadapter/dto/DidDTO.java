package com.sippulse.soapadapter.dto;

import com.sippulse.soapadapter.client.didWS.Did;

import java.util.List;

public record DidDTO(
        String accountCode,
        String aliasUsername,
        String didHeader,
        boolean didToRuri,
        String domain,
        String gwid,
        Integer id,
        String localArea,
        Double monthlySubscription,
        boolean reverseBilling,
        String username
) {
    public static DidDTO fromEntity(Did did){
        return new DidDTO(
                did.getAccountCode(),
                did.getAliasUsername(),
                did.getDidHeader(),
                did.isDidToRuri(),
                did.getDomain(),
                did.getGwid(),
                did.getId(),
                did.getLocalArea(),
                did.getMonthlySubscription(),
                did.isReverseBilling(),
                did.getUsername());
    }

    public static List<DidDTO> fromEntityList(List<Did> dids){
        return dids.stream()
                .map(DidDTO::fromEntity)
                .toList();
    }
}
