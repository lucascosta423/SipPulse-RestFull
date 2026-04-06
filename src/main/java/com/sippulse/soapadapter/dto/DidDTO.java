package com.sippulse.soapadapter.dto;

import com.sippulse.soapadapter.client.didWS.Did;

import java.util.List;

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
