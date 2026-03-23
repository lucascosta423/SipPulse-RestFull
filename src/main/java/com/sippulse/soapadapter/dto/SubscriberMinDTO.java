package com.sippulse.soapadapter.dto;

public record SubscriberMinDTO(
        String username,
        String emailAddress,
        String password,
        String passwordPortal,
        String domain,

// +++++++++++++++++++++++++++++++++++++++ //

        String profile,
        Integer ratePlanId,
        Integer countryCode,
        String rpid,
        Integer areaCode,
        Integer callLimit,
        int keepAlive,
        int cps,
        boolean activeIncomingCalls,
        boolean activeOutgoingCalls,
        Boolean callsOnlyByIp,
        Boolean voicemail,

// ++++++++++++++++++++++++++++++++++++++++ //

        String contractNumber,
        String document,
        String firstName,
        String lastName,
        Long mobile,
        Long phone,
        String address,
        String city,
        String complement,
        String number,
        String quarter,
        String state,
        String zip,
        Integer resellerId
) {
    public String accountCode() {
        return username + "@" + domain;
    }
}
