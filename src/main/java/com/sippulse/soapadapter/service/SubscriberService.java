package com.sippulse.soapadapter.service;

import com.sippulse.soapadapter.adapter.SubscriberClientAdapter;
import com.sippulse.soapadapter.client.subscriberWS.*;
import com.sippulse.soapadapter.dto.SubscriberMinDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class SubscriberService {

    private final SubscriberClientAdapter adapter;

    public SubscriberService(SubscriberClientAdapter adapter) {
        this.adapter = adapter;
    }

    public Integer insertSubscriber(SubscriberMinDTO subscriber){

        var sub = new SubscriberDTO();

        BeanUtils.copyProperties(subscriber,sub);

        var response = adapter.insertSubscriber(sub);

        updateSubscriberServices(subscriber);

        return response;
    }

    public void updateSubscriberServices(SubscriberMinDTO subscriber) {

        var subService = new SubscriberServicesDTO();

        BeanUtils.copyProperties(subscriber,subService);

        subService.setCps(0);
        subService.setKeepAlive(1);
        subService.setEmail(subscriber.emailAddress());

        adapter.updateSubscriberServices(subService);
    }

    public void activateSubscriber(String username, String domain) {
        adapter.activateSubscriber(username, domain);
    }

    public void blockSubscriber(String username, String domain) {
        adapter.blockSubscriber(username, domain);
    }

    public void activateIncommingCalls(String username, String domain) {
        adapter.activateIncommingCalls(username, domain);
    }

    public void blockIncommingCalls(String username, String domain) {
        adapter.blockIncommingCalls(username, domain);
    }

    public void addCredit(String username, String domain, Double value, String obs) {
        adapter.addCredit(username, domain, value, obs);
    }

    public void blockEntry0303(String username, String domain) {
        adapter.blockEntry0303(username, domain);
    }

    public String retrievePassword(String username, String domain) {
        return adapter.retrievePassword(username, domain);
    }

    public String retrievePasswordWEB(String username, String domain) {
        return adapter.retrievePasswordWEB(username, domain);
    }

    public void updateSubscriberClassV(SubscriberClassVDTO subscriber) {
        adapter.updateSubscriberClassV(subscriber);
    }

    public void updateSubscriberBillingInfo(SubscriberBillingInfoDTO subscriber) {
        adapter.updateSubscriberBillingInfo(subscriber);
    }

    public SubscriberDTO retrieveSubscriber(String username, String domain) {
        return adapter.retrieveSubscriber(username, domain);
    }

    public SubscriberClassVDTO retrieveSubscriberClassV(String username, String domain) {
        return adapter.retrieveSubscriberClassV(username, domain);
    }

    public void activateOutgoingCalls(String username, String domain) {
        adapter.activateOutgoingCalls(username, domain);
    }

    public void blockOutgoingCalls(String username, String domain) {
        adapter.blockOutgoingCalls(username, domain);
    }

    public void activateCallsOnlyByIp(String username, String domain) {
        adapter.activateCallsOnlyByIp(username, domain);
    }

    public void blockCallsOnlyByIp(String username, String domain) {
        adapter.blockCallsOnlyByIp(username, domain);
    }

    public void activateCollectCalls(String username, String domain) {
        adapter.activateCollectCalls(username, domain);
    }

    public void activateAnonymousCalls(String username, String domain) {
        adapter.activateAnonymousCalls(username, domain);
    }

    public void activatePrivacyCalls(String username, String domain) {
        adapter.activatePrivacyCalls(username, domain);
    }

    public void blockPrivacyCalls(String username, String domain) {
        adapter.blockPrivacyCalls(username, domain);
    }

    public void activateLowCreditNotification(String username, String domain, Double lowCreditLimit) {
        adapter.activateLowCreditNotification(username, domain, lowCreditLimit);
    }

    public void blockLowCreditNotification(String username, String domain) {
        adapter.blockLowCreditNotification(username, domain);
    }

    public void activateDailyStatistics(String username, String domain) {
        adapter.activateDailyStatistics(username, domain);
    }

    public void blockDailyStatistics(String username, String domain) {
        adapter.blockDailyStatistics(username, domain);
    }

    public void updateDailyQuota(SubscriberDailyQuotaDTO dailyQuotaDTO) {
        adapter.updateDailyQuota(dailyQuotaDTO);
    }

    public void blockCollectCalls(String username, String domain) {
        adapter.blockCollectCalls(username, domain);
    }

    public void blockAnonymousCalls(String username, String domain) {
        adapter.blockAnonymousCalls(username, domain);
    }

    public void updateMonthlyQuota(SubscriberMonthlyQuotaDTO monthlyQuotaDTO) {
        adapter.updateMonthlyQuota(monthlyQuotaDTO);
    }

    public void activateVoicemail(String username, String domain, Long voicemailPassword) {
        adapter.activateVoicemail(username, domain, voicemailPassword);
    }

    public void blockVoicemail(String username, String domain) {
        adapter.blockVoicemail(username, domain);
    }

    public void removeSubscriber(String username, String domain) {
        adapter.removeSubscriber(username, domain);
    }

    public Double retrieveCredit(String username, String domain) {
        return adapter.retrieveCredit(username, domain);
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

    public SubscriberDailyQuotaDTO retrieveDailyQuota(String username, String domain) {
        return adapter.retrieveDailyQuota(username, domain);
    }

    public SubscriberMonthlyQuotaDTO retrieveMonthlyQuotaDTO(String username, String domain) {
        return adapter.retrieveMonthlyQuotaDTO(username, domain);
    }

    public void activateSoftphone(String username, String domain) {
        adapter.activateSoftphone(username, domain);
    }

    public void blockSoftphone(String username, String domain) {
        adapter.blockSoftphone(username, domain);
    }

    public void activateEntry0303(String username, String domain) {
        adapter.activateEntry0303(username, domain);
    }

    public void disableValidateSource0303(String username, String domain) {
        adapter.disableValidateSource0303(username, domain);
    }

    public void activateValidateSource0303(String username, String domain) {
        adapter.activateValidateSource0303(username, domain);
    }

    public void changePassword(String username, String domain, String actualPassword, String newPassword, String confirmNewPassword) {
        adapter.changePassword(username, domain, actualPassword, newPassword, confirmNewPassword);
    }
}
