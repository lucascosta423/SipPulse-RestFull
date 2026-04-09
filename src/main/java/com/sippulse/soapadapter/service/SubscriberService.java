package com.sippulse.soapadapter.service;

import com.sippulse.soapadapter.adapter.SubscriberClientAdapter;
import com.sippulse.soapadapter.client.subscriberWS.*;
import com.sippulse.soapadapter.dto.AddCreditDTO;
import com.sippulse.soapadapter.dto.SubscriberMinDTO;
import com.sippulse.soapadapter.exception.SoapServiceException;
import com.sippulse.soapadapter.mapper.SubscriberMapper;
import com.sippulse.soapadapter.mapper.UpdateSubscriberMapper;
import com.sippulse.soapadapter.utils.AccountCodeUtils;
import org.springframework.stereotype.Service;

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


@Service
public class SubscriberService {

    private final SubscriberClientAdapter adapter;
    private final SubscriberMapper subscriberMapper;
    private final UpdateSubscriberMapper updateMapper;

    public SubscriberService(SubscriberClientAdapter adapter, SubscriberMapper subscriberMapper, UpdateSubscriberMapper updateMapper) {
        this.adapter = adapter;
        this.subscriberMapper = subscriberMapper;
        this.updateMapper = updateMapper;
    }

    public Integer insertSubscriber(SubscriberMinDTO subscriber) {

        SubscriberDTO subscriberDTO = subscriberMapper.toSoap(subscriber);

        Integer subscriberID = adapter.insertSubscriber(subscriberDTO);

        updateSubscriberServices(subscriber);

        return subscriberID;
    }

    public void updateSubscriberServices(SubscriberMinDTO subscriber) {

        var subService = updateMapper.toSoap(subscriber);

        adapter.updateSubscriberServices(subService);
    }

    public void updateSubscriberClassV(SubscriberClassVDTO subscriber) {
        adapter.updateSubscriberClassV(subscriber);
    }

    public void updateSubscriberBillingInfo(SubscriberBillingInfoDTO subscriber) {
        adapter.updateSubscriberBillingInfo(subscriber);
    }

    public SubscriberDTO retrieveSubscriber(String accountcode) {
        AccountCodeUtils ac = AccountCodeUtils.from(accountcode);
        return adapter.retrieveSubscriber(ac.username(), ac.domain());
    }

    public SubscriberClassVDTO retrieveSubscriberClassV(String accountcode) {
        AccountCodeUtils ac = AccountCodeUtils.from(accountcode);
        return adapter.retrieveSubscriberClassV(ac.username(), ac.domain());
    }

    public void activateSubscriber(String accountcode) {

        AccountCodeUtils ac = AccountCodeUtils.from(accountcode);

        adapter.activateSubscriber(ac.username(), ac.domain());
    }

    public void blockSubscriber(String accountcode) {
        AccountCodeUtils ac = AccountCodeUtils.from(accountcode);

        adapter.blockSubscriber(ac.username(), ac.domain());
    }

    public void activateIncommingCalls(String accountcode) {
        AccountCodeUtils ac = AccountCodeUtils.from(accountcode);

        adapter.activateIncommingCalls(ac.username(), ac.domain());
    }

    public void blockIncommingCalls(String accountcode) {
        AccountCodeUtils ac = AccountCodeUtils.from(accountcode);
        adapter.blockIncommingCalls(ac.username(), ac.domain());
    }

    public void blockOutgoingCalls(String accountcode) {
        AccountCodeUtils ac = AccountCodeUtils.from(accountcode);
        adapter.blockOutgoingCalls(ac.username(), ac.domain());
    }

    public void activateOutgoingCalls(String accountcode) {
        AccountCodeUtils ac = AccountCodeUtils.from(accountcode);
        adapter.activateOutgoingCalls(ac.username(), ac.domain());
    }

    public void addCredit(AddCreditDTO addCreditDTO) {
        AccountCodeUtils ac = AccountCodeUtils.from(addCreditDTO.accountcode());
        adapter.addCredit(
                ac.username(),
                ac.domain(),
                addCreditDTO.value(),
                addCreditDTO.obs()
        );
    }

    public void blockEntry0303(String accountcode) {
        AccountCodeUtils ac = AccountCodeUtils.from(accountcode);
        adapter.blockEntry0303(ac.username(), ac.domain());
    }

    public String retrievePassword(String accountcode) {
        AccountCodeUtils ac = AccountCodeUtils.from(accountcode);
        return adapter.retrievePassword(ac.username(), ac.domain());
    }

    public String retrievePasswordWEB(String accountcode) {
        AccountCodeUtils ac = AccountCodeUtils.from(accountcode);
        return adapter.retrievePasswordWEB(ac.username(), ac.domain());
    }

    public void activateCallsOnlyByIp(String accountcode) {
        AccountCodeUtils ac = AccountCodeUtils.from(accountcode);
        adapter.activateCallsOnlyByIp(ac.username(), ac.domain());
    }

    public void blockCallsOnlyByIp(String accountcode) {
        AccountCodeUtils ac = AccountCodeUtils.from(accountcode);
        adapter.blockCallsOnlyByIp(ac.username(), ac.domain());
    }

    public void activateCollectCalls(String accountcode) {
        AccountCodeUtils ac = AccountCodeUtils.from(accountcode);
        adapter.activateCollectCalls(ac.username(), ac.domain());
    }

    public void activateAnonymousCalls(String accountcode) {
        AccountCodeUtils ac = AccountCodeUtils.from(accountcode);
        adapter.activateAnonymousCalls(ac.username(), ac.domain());
    }

    public void activatePrivacyCalls(String accountcode) {
        AccountCodeUtils ac = AccountCodeUtils.from(accountcode);
        adapter.activatePrivacyCalls(ac.username(), ac.domain());
    }

    public void blockPrivacyCalls(String accountcode) {
        AccountCodeUtils ac = AccountCodeUtils.from(accountcode);
        adapter.blockPrivacyCalls(ac.username(), ac.domain());
    }

    public void activateLowCreditNotification(String accountcode, Double lowCreditLimit) {
        AccountCodeUtils ac = AccountCodeUtils.from(accountcode);
        adapter.activateLowCreditNotification(ac.username(), ac.domain(), lowCreditLimit);
    }

    public void blockLowCreditNotification(String accountcode) {
        AccountCodeUtils ac = AccountCodeUtils.from(accountcode);
        adapter.blockLowCreditNotification(ac.username(), ac.domain());
    }

    public void activateDailyStatistics(String accountcode) {
        AccountCodeUtils ac = AccountCodeUtils.from(accountcode);
        adapter.activateDailyStatistics(ac.username(), ac.domain());
    }

    public void blockDailyStatistics(String accountcode) {
        AccountCodeUtils ac = AccountCodeUtils.from(accountcode);
        adapter.blockDailyStatistics(ac.username(), ac.domain());
    }

    public void updateDailyQuota(SubscriberDailyQuotaDTO dailyQuotaDTO) {
        adapter.updateDailyQuota(dailyQuotaDTO);
    }

    public void blockCollectCalls(String accountcode) {
        AccountCodeUtils ac = AccountCodeUtils.from(accountcode);
        adapter.blockCollectCalls(ac.username(), ac.domain());
    }

    public void blockAnonymousCalls(String accountcode) {
        AccountCodeUtils ac = AccountCodeUtils.from(accountcode);
        adapter.blockAnonymousCalls(ac.username(), ac.domain());
    }

    public void updateMonthlyQuota(SubscriberMonthlyQuotaDTO monthlyQuotaDTO) {
        adapter.updateMonthlyQuota(monthlyQuotaDTO);
    }

    public void activateVoicemail(String accountcode, Long voicemailPassword) {
        AccountCodeUtils ac = AccountCodeUtils.from(accountcode);
        adapter.activateVoicemail(ac.username(), ac.domain(), voicemailPassword);
    }

    public void blockVoicemail(String accountcode) {
        AccountCodeUtils ac = AccountCodeUtils.from(accountcode);
        adapter.blockVoicemail(ac.username(), ac.domain());
    }

    public void removeSubscriber(String accountcode) {
        AccountCodeUtils ac = AccountCodeUtils.from(accountcode);
        adapter.removeSubscriber(ac.username(), ac.domain());
    }

    public Double retrieveCredit(String accountcode) {
        AccountCodeUtils ac = AccountCodeUtils.from(accountcode);
        return adapter.retrieveCredit(ac.username(), ac.domain());
    }

    public void updateSubscriber(SubscriberDTO subscriber) {
        adapter.updateSubscriber(subscriber);
    }

    public void changePasswordWEB(String username, String domain, String actualPassword, String newPassword, String confirmNewPassword) {
        adapter.changePasswordWEB(username, domain, actualPassword, newPassword, confirmNewPassword);
    }

    public void changeProfile(String username, String domain, Integer newProfileId) {
        adapter.changeProfile(username, domain, newProfileId);
    }

    public SubscriberDailyQuotaDTO retrieveDailyQuota(String accountcode) {
        AccountCodeUtils ac = AccountCodeUtils.from(accountcode);
        return adapter.retrieveDailyQuota(ac.username(), ac.domain());
    }

    public SubscriberMonthlyQuotaDTO retrieveMonthlyQuotaDTO(String accountcode) {
        AccountCodeUtils ac = AccountCodeUtils.from(accountcode);
        return adapter.retrieveMonthlyQuotaDTO(ac.username(), ac.domain());
    }

    public void activateSoftphone(String accountcode) {
        AccountCodeUtils ac = AccountCodeUtils.from(accountcode);
        adapter.activateSoftphone(ac.username(), ac.domain());
    }

    public void blockSoftphone(String accountcode) {
        AccountCodeUtils ac = AccountCodeUtils.from(accountcode);
        adapter.blockSoftphone(ac.username(), ac.domain());
    }

    public void activateEntry0303(String accountcode) {
        AccountCodeUtils ac = AccountCodeUtils.from(accountcode);
        adapter.activateEntry0303(ac.username(), ac.domain());
    }

    public void disableValidateSource0303(String accountcode) {
        AccountCodeUtils ac = AccountCodeUtils.from(accountcode);
        adapter.disableValidateSource0303(ac.username(), ac.domain());
    }

    public void activateValidateSource0303(String accountcode) {
        AccountCodeUtils ac = AccountCodeUtils.from(accountcode);
        adapter.activateValidateSource0303(ac.username(), ac.domain());
    }

    public void changePassword(String username, String domain, String actualPassword, String newPassword, String confirmNewPassword) {
        adapter.changePassword(username, domain, actualPassword, newPassword, confirmNewPassword);
    }
}
