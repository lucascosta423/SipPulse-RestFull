package com.sippulse.soapadapter.service;

import com.sippulse.soapadapter.adapter.SubscriberClientAdapter;
import com.sippulse.soapadapter.client.subscriberWS.*;
import org.springframework.stereotype.Service;

@Service
public class SubscriberService {

    private final SubscriberClientAdapter adapter;

    public SubscriberService(SubscriberClientAdapter adapter) {
        this.adapter = adapter;
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

    public void updateSubscriberBillingInfo(SubscriberBillingInfoDTO subscriber, UserPrincipalDTO principal) {
        adapter.updateSubscriberBillingInfo(subscriber, principal);
    }

    public void updateSubscriberServices(SubscriberServicesDTO subscriber, UserPrincipalDTO principal) {
        adapter.updateSubscriberServices(subscriber, principal);
    }

    public SubscriberDTO retrieveSubscriber(String username, String domain, UserPrincipalDTO principal) {
        return adapter.retrieveSubscriber(username, domain, principal);
    }

    public SubscriberClassVDTO retrieveSubscriberClassV(String username, String domain, UserPrincipalDTO principal) {
        return adapter.retrieveSubscriberClassV(username, domain, principal);
    }

    public void activateIncommingCalls(String username, String domain, UserPrincipalDTO principal) {
        adapter.activateIncommingCalls(username, domain, principal);
    }

    public void blockIncommingCalls(String username, String domain, UserPrincipalDTO principal) {
        adapter.blockIncommingCalls(username, domain, principal);
    }

    public void activateOutgoingCalls(String username, String domain, UserPrincipalDTO principal) {
        adapter.activateOutgoingCalls(username, domain, principal);
    }

    public void blockOutgoingCalls(String username, String domain, UserPrincipalDTO principal) {
        adapter.blockOutgoingCalls(username, domain, principal);
    }

    public void activateCallsOnlyByIp(String username, String domain, UserPrincipalDTO principal) {
        adapter.activateCallsOnlyByIp(username, domain, principal);
    }

    public void blockCallsOnlyByIp(String username, String domain, UserPrincipalDTO principal) {
        adapter.blockCallsOnlyByIp(username, domain, principal);
    }

    public void activateCollectCalls(String username, String domain, UserPrincipalDTO principal) {
        adapter.activateCollectCalls(username, domain, principal);
    }

    public void activateAnonymousCalls(String username, String domain, UserPrincipalDTO principal) {
        adapter.activateAnonymousCalls(username, domain, principal);
    }

    public void activatePrivacyCalls(String username, String domain, UserPrincipalDTO principal) {
        adapter.activatePrivacyCalls(username, domain, principal);
    }

    public void blockPrivacyCalls(String username, String domain, UserPrincipalDTO principal) {
        adapter.blockPrivacyCalls(username, domain, principal);
    }

    public void activateLowCreditNotification(String username, String domain, Double lowCreditLimit, UserPrincipalDTO principal) {
        adapter.activateLowCreditNotification(username, domain, lowCreditLimit, principal);
    }

    public void blockLowCreditNotification(String username, String domain, UserPrincipalDTO principal) {
        adapter.blockLowCreditNotification(username, domain, principal);
    }

    public void activateDailyStatistics(String username, String domain, UserPrincipalDTO principal) {
        adapter.activateDailyStatistics(username, domain, principal);
    }

    public void blockDailyStatistics(String username, String domain, UserPrincipalDTO principal) {
        adapter.blockDailyStatistics(username, domain, principal);
    }

    public void updateDailyQuota(SubscriberDailyQuotaDTO dailyQuotaDTO, UserPrincipalDTO principal) {
        adapter.updateDailyQuota(dailyQuotaDTO, principal);
    }

    public void blockCollectCalls(String username, String domain, UserPrincipalDTO principal) {
        adapter.blockCollectCalls(username, domain, principal);
    }

    public void blockAnonymousCalls(String username, String domain, UserPrincipalDTO principal) {
        adapter.blockAnonymousCalls(username, domain, principal);
    }

    public void updateMonthlyQuota(SubscriberMonthlyQuotaDTO monthlyQuotaDTO, UserPrincipalDTO principal) {
        adapter.updateMonthlyQuota(monthlyQuotaDTO, principal);
    }

    public void blockSubscriber(String username, String domain, UserPrincipalDTO principal) {
        adapter.blockSubscriber(username, domain, principal);
    }

    public void activateSubscriber(String username, String domain, UserPrincipalDTO principal) {
        adapter.activateSubscriber(username, domain, principal);
    }

    public void activateVoicemail(String username, String domain, Long voicemailPassword, UserPrincipalDTO principal) {
        adapter.activateVoicemail(username, domain, voicemailPassword, principal);
    }

    public void blockVoicemail(String username, String domain, UserPrincipalDTO principal) {
        adapter.blockVoicemail(username, domain, principal);
    }

    public void removeSubscriber(String username, String domain, UserPrincipalDTO principal) {
        adapter.removeSubscriber(username, domain, principal);
    }

    public Double retrieveCredit(String username, String domain, UserPrincipalDTO principal) {
        return adapter.retrieveCredit(username, domain, principal);
    }

    public void addCredit(String username, String domain, Double value, String obs, UserPrincipalDTO principal) {
        adapter.addCredit(username, domain, value, obs, principal);
    }

    public Integer insertSubscriber(SubscriberDTO subscriber, UserPrincipalDTO principal) {
        return adapter.insertSubscriber(subscriber, principal);
    }

    public void updateSubscriber(SubscriberDTO subscriber, UserPrincipalDTO principal) {
        adapter.updateSubscriber(subscriber, principal);
    }

    public void changePasswordWEB(String username, String domain, String actualPassword, String newPassword, String confirmNewPassword, UserPrincipalDTO principal) {
        adapter.changePasswordWEB(username, domain, actualPassword, newPassword, confirmNewPassword, principal);
    }

    public void changeProfile(String username, String domain, Integer newProfileId, UserPrincipalDTO principal) {
        adapter.changeProfile(username, domain, newProfileId, principal);
    }

    public SubscriberDailyQuotaDTO retrieveDailyQuota(String username, String domain, UserPrincipalDTO principal) {
        return adapter.retrieveDailyQuota(username, domain, principal);
    }

    public SubscriberMonthlyQuotaDTO retrieveMonthlyQuotaDTO(String username, String domain, UserPrincipalDTO principal) {
        return adapter.retrieveMonthlyQuotaDTO(username, domain, principal);
    }

    public void activateSoftphone(String username, String domain, UserPrincipalDTO principal) {
        adapter.activateSoftphone(username, domain, principal);
    }

    public void blockSoftphone(String username, String domain, UserPrincipalDTO principal) {
        adapter.blockSoftphone(username, domain, principal);
    }

    public void activateEntry0303(String username, String domain, UserPrincipalDTO principal) {
        adapter.activateEntry0303(username, domain, principal);
    }

    public void disableValidateSource0303(String username, String domain, UserPrincipalDTO principal) {
        adapter.disableValidateSource0303(username, domain, principal);
    }

    public void activateValidateSource0303(String username, String domain, UserPrincipalDTO principal) {
        adapter.activateValidateSource0303(username, domain, principal);
    }

    public void changePassword(String username, String domain, String actualPassword, String newPassword, String confirmNewPassword, UserPrincipalDTO principal) {
        adapter.changePassword(username, domain, actualPassword, newPassword, confirmNewPassword, principal);
    }
}
