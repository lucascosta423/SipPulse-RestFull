package com.sippulse.soapadapter.adapter;

import com.sippulse.soapadapter.client.subscriberWS.*;
import com.sippulse.soapadapter.mapper.SoapAuthMapper;
import org.springframework.stereotype.Component;

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
            throw new RuntimeException("Erro ao bloquear entrada 0303", e);
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
            throw new RuntimeException("Erro ao recuperar senha",e);
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
            throw new RuntimeException("Erro ao recuperar senha WEB", e);
        }
    }

    
    public void updateSubscriberClassV(SubscriberClassVDTO subscriber)  {
        try{
            subscriberWS.updateSubscriberClassV(
                    subscriber,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new RuntimeException("Erro ao atualizar assinante class V", e);
        }
    }

    
    public void updateSubscriberBillingInfo(SubscriberBillingInfoDTO subscriber)  {
        try {
            subscriberWS.updateSubscriberBillingInfo(
                    subscriber,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new RuntimeException("Erro ao atualizar assinante billing info", e);
        }
    }

    
    public void updateSubscriberServices(SubscriberServicesDTO subscriber)  {
        try {
            subscriberWS.updateSubscriberServices(
                    subscriber,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new RuntimeException("Erro ao atualizar serviços do assinante", e);
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
            throw new RuntimeException("Erro ao recuperar assinante", e);
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
            throw new RuntimeException("Erro ao recuperar assinante class V", e);
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
            throw new RuntimeException("Erro ao ativar chamadas recebidas", e);
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
            throw new RuntimeException("Erro ao bloquear chamadas recebidas", e);
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
            throw new RuntimeException("Erro ao ativar chamadas realizadas", e);
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
            throw new RuntimeException("Erro ao bloquear chamadas realizadas", e);
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
            throw new RuntimeException("Erro ao ativar chamadas somente por IP", e);
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
            throw new RuntimeException("Erro ao bloquear chamadas somente por IP", e);
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
            throw new RuntimeException("Erro ao ativar chamadas a cobrar", e);
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
            throw new RuntimeException("Erro ao ativar chamadas anônimas", e);
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
            throw new RuntimeException("Erro ao ativar privacidade de chamadas", e);
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
            throw new RuntimeException("Erro ao bloquear privacidade de chamadas", e);
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
            throw new RuntimeException("Erro ao ativar notificação de crédito baixo", e);
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
            throw new RuntimeException("Erro ao bloquear notificação de crédito baixo", e);
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
            throw new RuntimeException("Erro ao ativar estatísticas diárias", e);
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
            throw new RuntimeException("Erro ao bloquear estatísticas diárias", e);
        }
    }

    
    public void updateDailyQuota(SubscriberDailyQuotaDTO dailyQuotaDTO)  {
        try {
            subscriberWS.updateDailyQuota(
                    dailyQuotaDTO,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new RuntimeException("Erro ao atualizar cota diária", e);
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
            throw new RuntimeException("Erro ao bloquear chamadas a cobrar", e);
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
            throw new RuntimeException("Erro ao bloquear chamadas anônimas", e);
        }
    }

    
    public void updateMonthlyQuota(SubscriberMonthlyQuotaDTO monthlyQuotaDTO)  {
        try {
            subscriberWS.updateMonthlyQuota(
                    monthlyQuotaDTO,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new RuntimeException("Erro ao atualizar cota mensal", e);
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
            throw new RuntimeException("Erro ao bloquear assinante", e);
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
            throw new RuntimeException("Erro ao ativar assinante", e);
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
            throw new RuntimeException("Erro ao ativar correio de voz", e);
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
            throw new RuntimeException("Erro ao bloquear correio de voz", e);
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
            throw new RuntimeException("Erro ao remover assinante", e);
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
            throw new RuntimeException("Erro ao recuperar crédito", e);
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
            throw new RuntimeException("Erro ao adicionar crédito", e);
        }
    }


    public Integer insertSubscriber(SubscriberDTO subscriber)  {
        try {
            return subscriberWS.insertSubscriber(
                    subscriber,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new RuntimeException("Erro ao inserir assinante", e);
        }
    }


    public void updateSubscriber(SubscriberDTO subscriber)  {
        try {
            subscriberWS.updateSubscriber(
                    subscriber,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new RuntimeException("Erro ao atualizar assinante", e);
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
            throw new RuntimeException("Erro ao alterar senha WEB", e);
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
            throw new RuntimeException("Erro ao alterar perfil", e);
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
            throw new RuntimeException("Erro ao recuperar cota diária", e);
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
            throw new RuntimeException("Erro ao recuperar cota mensal", e);
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
            throw new RuntimeException("Erro ao ativar softphone", e);
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
            throw new RuntimeException("Erro ao bloquear softphone", e);
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
            throw new RuntimeException("Erro ao ativar entrada 0303", e);
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
            throw new RuntimeException("Erro ao desabilitar validação de origem 0303", e);
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
            throw new RuntimeException("Erro ao ativar validação de origem 0303", e);
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
            throw new RuntimeException("Erro ao alterar senha", e);
        }
    }
}
