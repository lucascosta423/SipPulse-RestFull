package com.sippulse.soapadapter.service;

import com.sippulse.soapadapter.sippulse.client.subscriberWS.*;
import com.sippulse.soapadapter.sippulse.mapper.SipPulseAuthMapper;
import org.springframework.stereotype.Service;

@Service
public class SubscriberSoapToRestService{
    private final SubscriberWS subscriberWS;

    private final SipPulseAuthMapper authMapper;

    public SubscriberSoapToRestService(SubscriberWS subscriberWS, SipPulseAuthMapper authMapper) {
        this.subscriberWS = subscriberWS;
        this.authMapper = authMapper;
    }

    public Integer insertSubscriber(SubscriberDTO subscriber, UserPrincipalDTO principal) throws WSException {
        return 0;
    }

    public void blockEntry0303(String username, String domain, UserPrincipalDTO principal) throws WSException {

    }


    public String retrievePassword(String username, String domain, UserPrincipalDTO principal) throws WSException {
        return "";
    }


    public String retrievePasswordWEB(String username, String domain, UserPrincipalDTO principal) throws WSException {
        return "";
    }


    public void updateSubscriberClassV(SubscriberClassVDTO subscriber, UserPrincipalDTO principal) throws WSException {

    }


    public void updateSubscriberBillingInfo(SubscriberBillingInfoDTO subscriber, UserPrincipalDTO principal) throws WSException {

    }


    public void updateSubscriberServices(SubscriberServicesDTO subscriber, UserPrincipalDTO principal) throws WSException {

    }


    public SubscriberDTO retrieveSubscriber(String username, String domain, UserPrincipalDTO principal) throws WSException {
        return null;
    }


    public SubscriberClassVDTO retrieveSubscriberClassV(String username, String domain, UserPrincipalDTO principal) throws WSException {
        return null;
    }


    public void activateIncommingCalls(String username, String domain, UserPrincipalDTO principal) throws WSException {

    }


    public void blockIncommingCalls(String username, String domain, UserPrincipalDTO principal) throws WSException {

    }


    public void activateOutgoingCalls(String username, String domain, UserPrincipalDTO principal) throws WSException {

    }


    public void blockOutgoingCalls(String username, String domain, UserPrincipalDTO principal) throws WSException {

    }


    public void activateCallsOnlyByIp(String username, String domain, UserPrincipalDTO principal) throws WSException {

    }


    public void blockCallsOnlyByIp(String username, String domain, UserPrincipalDTO principal) throws WSException {

    }


    public void activateCollectCalls(String username, String domain, UserPrincipalDTO principal) throws WSException {

    }


    public void activateAnonymousCalls(String username, String domain, UserPrincipalDTO principal) throws WSException {

    }


    public void activatePrivacyCalls(String username, String domain, UserPrincipalDTO principal) throws WSException {

    }


    public void blockPrivacyCalls(String username, String domain, UserPrincipalDTO principal) throws WSException {

    }


    public void activateLowCreditNotification(String username, String domain, Double lowCreditLimit, UserPrincipalDTO principal) throws WSException {

    }


    public void blockLowCreditNotification(String username, String domain, UserPrincipalDTO principal) throws WSException {

    }


    public void activateDailyStatistics(String username, String domain, UserPrincipalDTO principal) throws WSException {

    }


    public void blockDailyStatistics(String username, String domain, UserPrincipalDTO principal) throws WSException {

    }


    public void updateDailyQuota(SubscriberDailyQuotaDTO dailyQuotaDTO, UserPrincipalDTO principal) throws WSException {

    }


    public void blockCollectCalls(String username, String domain, UserPrincipalDTO principal) throws WSException {

    }


    public void blockAnonymousCalls(String username, String domain, UserPrincipalDTO principal) throws WSException {

    }


    public void updateMonthlyQuota(SubscriberMonthlyQuotaDTO monthlyQuotaDTO, UserPrincipalDTO principal) throws WSException {

    }


    public void blockSubscriber(String username, String domain, UserPrincipalDTO principal) throws WSException {

    }


    public void activateSubscriber(String username, String domain, UserPrincipalDTO principal) throws WSException {

    }


    public void activateVoicemail(String username, String domain, Long voicemailPassword, UserPrincipalDTO principal) throws WSException {

    }


    public void blockVoicemail(String username, String domain, UserPrincipalDTO principal) throws WSException {

    }


    public void removeSubscriber(String username, String domain, UserPrincipalDTO principal) throws WSException {

    }


    public Double retrieveCredit(String username, String domain, UserPrincipalDTO principal) throws WSException {
        return 0.0;
    }


    public void addCredit(String username, String domain, Double value, String obs, UserPrincipalDTO principal) throws WSException {

    }


    
    public void updateSubscriber(SubscriberDTO subscriber, UserPrincipalDTO principal) throws WSException {

    }

    
    public void changePasswordWEB(String username, String domain, String actualPassword, String newPassword, String confirmNewPassword, UserPrincipalDTO principal) throws WSException {

    }

    
    public void changeProfile(String username, String domain, Integer newProfileId, UserPrincipalDTO principal) throws WSException {

    }

    
    public SubscriberDailyQuotaDTO retrieveDailyQuota(String username, String domain, UserPrincipalDTO principal) throws WSException {
        return null;
    }

    
    public SubscriberMonthlyQuotaDTO retrieveMonthlyQuotaDTO(String username, String domain, UserPrincipalDTO principal) throws WSException {
        return null;
    }

    
    public void activateSoftphone(String username, String domain, UserPrincipalDTO principal) throws WSException {

    }

    
    public void blockSoftphone(String username, String domain, UserPrincipalDTO principal) throws WSException {

    }

    
    public void activateEntry0303(String username, String domain, UserPrincipalDTO principal) throws WSException {

    }

    
    public void disableValidateSource0303(String username, String domain, UserPrincipalDTO principal) throws WSException {

    }

    
    public void activateValidateSource0303(String username, String domain, UserPrincipalDTO principal) throws WSException {

    }

    
    public void changePassword(String username, String domain, String actualPassword, String newPassword, String confirmNewPassword, UserPrincipalDTO principal) throws WSException {

    }

}
