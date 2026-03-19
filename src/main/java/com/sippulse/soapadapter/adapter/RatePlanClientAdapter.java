package com.sippulse.soapadapter.adapter;

import com.sippulse.soapadapter.client.ratePlanWS.*;
import com.sippulse.soapadapter.mapper.SipPulseAuthMapper;
import jakarta.xml.ws.Holder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RatePlanClientAdapter {

    private final RatePlanWS ratePlanWS;
    private final SipPulseAuthMapper authMapper;

    public RatePlanClientAdapter(RatePlanWS ratePlanWS, SipPulseAuthMapper authMapper) {
        this.ratePlanWS = ratePlanWS;
        this.authMapper = authMapper;
    }

    public List<RatePlan> listRatePlansByDomain(String domain, UserPrincipalDTO principal) {
        try {
            return ratePlanWS.listRatePlansByDomain(
                    domain,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        } catch (WSException e) {
            throw new RuntimeException("Erro ao listar rate plans", e);
        }
    }

    public void insertRatePlan(RatePlan ratePlan, UserPrincipalDTO principal) {
        try {
            Holder<RatePlan> holder = new Holder<>(ratePlan);
            ratePlanWS.insertRatePlan(
                    holder,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        } catch (WSException e) {
            throw new RuntimeException("Erro ao inserir rate plan", e);
        }
    }

    public void updateRatePlan(RatePlan ratePlan, UserPrincipalDTO principal) {
        try {
            Holder<RatePlan> holder = new Holder<>(ratePlan);
            ratePlanWS.updateRatePlan(
                    holder,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        } catch (WSException e) {
            throw new RuntimeException("Erro ao atualizar rate plan", e);
        }
    }

    public void removeRatePlan(Integer idRatePlan, UserPrincipalDTO principal) {
        try {
            ratePlanWS.removeRatePlan(
                    idRatePlan,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        } catch (WSException e) {
            throw new RuntimeException("Erro ao remover rate plan", e);
        }
    }
}
