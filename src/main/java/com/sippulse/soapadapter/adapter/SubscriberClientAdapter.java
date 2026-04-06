package com.sippulse.soapadapter.adapter;

import com.sippulse.soapadapter.exception.SoapServiceException;
import com.sippulse.soapadapter.client.subscriberWS.*;
import com.sippulse.soapadapter.mapper.SoapAuthMapper;
import org.springframework.stereotype.Component;

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


@Component
public class SubscriberClientAdapter{

    private final SubscriberWS subscriberWS;
    private final SoapAuthMapper authMapper;

    public SubscriberClientAdapter(SubscriberWS subscriberWS, SoapAuthMapper authMapper) {
        this.subscriberWS = subscriberWS;
        this.authMapper = authMapper;
    }


    public void blockEntry0303(String username, String domain)  {
        try{
            subscriberWS.blockEntry0303(username, domain, authMapper.toSoapUser(UserPrincipalDTO::new));
        }catch (WSException e){
            throw new SoapServiceException("Failed to block 0303 entry", e);
        }
    }

    
    public String retrievePassword(String username, String domain)  {
        try {
            return subscriberWS.retrievePassword(
                    username,
                    domain,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        } catch (WSException e) {
            throw new SoapServiceException("Failed to retrieve password",e);
        }
    }

    
    public String retrievePasswordWEB(String username, String domain)  {
        try {
            return subscriberWS.retrievePasswordWEB(
                    username,
                    domain,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to retrieve web password", e);
        }
    }

    
    public void updateSubscriberClassV(SubscriberClassVDTO subscriber)  {
        try{
            subscriberWS.updateSubscriberClassV(
                    subscriber,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to update subscriber Class V", e);
        }
    }

    
    public void updateSubscriberBillingInfo(SubscriberBillingInfoDTO subscriber)  {
        try {
            subscriberWS.updateSubscriberBillingInfo(
                    subscriber,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to update subscriber billing info", e);
        }
    }

    
    public void updateSubscriberServices(SubscriberServicesDTO subscriber)  {
        try {
            subscriberWS.updateSubscriberServices(
                    subscriber,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to update subscriber services", e);
        }
    }

    
    public SubscriberDTO retrieveSubscriber(String username, String domain)  {
        try {
            return subscriberWS.retrieveSubscriber(
                    username,
                    domain,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to retrieve subscriber", e);
        }
    }

    
    public SubscriberClassVDTO retrieveSubscriberClassV(String username, String domain)  {
        try {
            return subscriberWS.retrieveSubscriberClassV(
                    username,
                    domain,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to retrieve subscriber Class V", e);
        }
    }

    
    public void activateIncommingCalls(String username, String domain)  {
        try {
            subscriberWS.activateIncommingCalls(
                    username,
                    domain,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to activate incoming calls", e);
        }
    }

    
    public void blockIncommingCalls(String username, String domain)  {
        try {
            subscriberWS.blockIncommingCalls(
                    username,
                    domain,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to block incoming calls", e);
        }
    }

    
    public void activateOutgoingCalls(String username, String domain)  {
        try {
            subscriberWS.activateOutgoingCalls(
                    username,
                    domain,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to activate outgoing calls", e);
        }
    }

    
    public void blockOutgoingCalls(String username, String domain)  {
        try {
            subscriberWS.blockOutgoingCalls(
                    username,
                    domain,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to block outgoing calls", e);
        }
    }

    
    public void activateCallsOnlyByIp(String username, String domain)  {
        try {
            subscriberWS.activateCallsOnlyByIp(
                    username,
                    domain,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to activate calls only by IP", e);
        }
    }

    
    public void blockCallsOnlyByIp(String username, String domain)  {
        try {
            subscriberWS.blockCallsOnlyByIp(
                    username,
                    domain,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to block calls only by IP", e);
        }
    }

    
    public void activateCollectCalls(String username, String domain)  {
        try {
            subscriberWS.activateCollectCalls(
                    username,
                    domain,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to activate collect calls", e);
        }
    }

    
    public void activateAnonymousCalls(String username, String domain)  {
        try {
            subscriberWS.activateAnonymousCalls(
                    username,
                    domain,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to activate anonymous calls", e);
        }
    }

    
    public void activatePrivacyCalls(String username, String domain)  {
        try {
            subscriberWS.activatePrivacyCalls(
                    username,
                    domain,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to activate call privacy", e);
        }
    }

    
    public void blockPrivacyCalls(String username, String domain)  {
        try {
            subscriberWS.blockPrivacyCalls(
                    username,
                    domain,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to block call privacy", e);
        }
    }

    
    public void activateLowCreditNotification(String username, String domain, Double lowCreditLimit)  {
        try {
            subscriberWS.activateLowCreditNotification(
                    username,
                    domain,
                    lowCreditLimit,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to activate low credit notification", e);
        }
    }

    
    public void blockLowCreditNotification(String username, String domain)  {
        try {
            subscriberWS.blockLowCreditNotification(
                    username,
                    domain,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to block low credit notification", e);
        }
    }

    
    public void activateDailyStatistics(String username, String domain)  {
        try {
            subscriberWS.activateDailyStatistics(
                    username,
                    domain,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to activate daily statistics", e);
        }
    }

    
    public void blockDailyStatistics(String username, String domain)  {
        try {
            subscriberWS.blockDailyStatistics(
                    username,
                    domain,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to block daily statistics", e);
        }
    }

    
    public void updateDailyQuota(SubscriberDailyQuotaDTO dailyQuotaDTO)  {
        try {
            subscriberWS.updateDailyQuota(
                    dailyQuotaDTO,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to update daily quota", e);
        }
    }

    
    public void blockCollectCalls(String username, String domain)  {
        try {
            subscriberWS.blockCollectCalls(
                    username,
                    domain,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to block collect calls", e);
        }
    }

    
    public void blockAnonymousCalls(String username, String domain)  {
        try {
            subscriberWS.blockAnonymousCalls(
                    username,
                    domain,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to block anonymous calls", e);
        }
    }

    
    public void updateMonthlyQuota(SubscriberMonthlyQuotaDTO monthlyQuotaDTO)  {
        try {
            subscriberWS.updateMonthlyQuota(
                    monthlyQuotaDTO,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to update monthly quota", e);
        }
    }

    
    public void blockSubscriber(String username, String domain)  {
        try {
            subscriberWS.blockSubscriber(
                    username,
                    domain,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to block subscriber", e);
        }
    }

    
    public void activateSubscriber(String username, String domain)  {
        try {
            subscriberWS.activateSubscriber(
                    username,
                    domain,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to activate subscriber", e);
        }
    }

    
    public void activateVoicemail(String username, String domain, Long voicemailPassword)  {
        try {
            subscriberWS.activateVoicemail(
                    username,
                    domain,
                    voicemailPassword,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to activate voicemail", e);
        }
    }

    
    public void blockVoicemail(String username, String domain)  {
        try {
            subscriberWS.blockVoicemail(
                    username,
                    domain,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to block voicemail", e);
        }
    }

    
    public void removeSubscriber(String username, String domain)  {
        try {
            subscriberWS.removeSubscriber(
                    username,
                    domain,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to remove subscriber", e);
        }
    }


    public Double retrieveCredit(String username, String domain)  {
        try {
            return subscriberWS.retrieveCredit(
                    username,
                    domain,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to retrieve credit", e);
        }
    }


    public void addCredit(String username, String domain, Double value, String obs)  {
        try {
            subscriberWS.addCredit(
                    username,
                    domain,
                    value,
                    obs,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to add credit", e);
        }
    }


    public Integer insertSubscriber(SubscriberDTO subscriber)  {
        try {
            return subscriberWS.insertSubscriber(
                    subscriber,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to insert subscriber", e);
        }
    }


    public void updateSubscriber(SubscriberDTO subscriber)  {
        try {
            subscriberWS.updateSubscriber(
                    subscriber,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to update subscriber", e);
        }
    }


    public void changePasswordWEB(String username, String domain, String actualPassword, String newPassword, String confirmNewPassword)  {
        try {
            subscriberWS.changePasswordWEB(
                    username,
                    domain,
                    actualPassword,
                    newPassword,
                    confirmNewPassword,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to change web password", e);
        }
    }


    public void changeProfile(String username, String domain, Integer newProfileId)  {
        try {
            subscriberWS.changeProfile(
                    username,
                    domain,
                    newProfileId,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to change profile", e);
        }
    }


    public SubscriberDailyQuotaDTO retrieveDailyQuota(String username, String domain)  {
        try {
            return subscriberWS.retrieveDailyQuota(
                    username,
                    domain,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to retrieve daily quota", e);
        }
    }


    public SubscriberMonthlyQuotaDTO retrieveMonthlyQuotaDTO(String username, String domain)  {
        try {
            return subscriberWS.retrieveMonthlyQuotaDTO(
                    username,
                    domain,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to retrieve monthly quota", e);
        }
    }


    public void activateSoftphone(String username, String domain)  {
        try {
            subscriberWS.activateSoftphone(
                    username,
                    domain,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to activate softphone", e);
        }
    }


    public void blockSoftphone(String username, String domain)  {
        try {
            subscriberWS.blockSoftphone(
                    username,
                    domain,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to block softphone", e);
        }
    }


    public void activateEntry0303(String username, String domain)  {
        try {
            subscriberWS.activateEntry0303(
                    username,
                    domain,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to activate 0303 entry", e);
        }
    }


    public void disableValidateSource0303(String username, String domain)  {
        try {
            subscriberWS.disableValidateSource0303(
                    username,
                    domain,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to disable source validation 0303", e);
        }
    }


    public void activateValidateSource0303(String username, String domain)  {
        try {
            subscriberWS.activateValidateSource0303(
                    username,
                    domain,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to activate source validation 0303", e);
        }
    }


    public void changePassword(String username, String domain, String actualPassword, String newPassword, String confirmNewPassword)  {
        try {
            subscriberWS.changePassword(
                    username,
                    domain,
                    actualPassword,
                    newPassword,
                    confirmNewPassword,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Failed to change password", e);
        }
    }
}
