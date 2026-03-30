package com.sippulse.soapadapter.adapter;

import com.sippulse.soapadapter.client.ratePlanWS.*;
import com.sippulse.soapadapter.mapper.SoapAuthMapper;
import jakarta.xml.ws.Holder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RatePlanClientAdapter {

    private final RatePlanWS ratePlanWS;
    private final SoapAuthMapper authMapper;

    public RatePlanClientAdapter(RatePlanWS ratePlanWS, SoapAuthMapper authMapper) {
        this.ratePlanWS = ratePlanWS;
        this.authMapper = authMapper;
    }

    public List<RatePlan> listRatePlansByDomain(String domain) {
        try {
            return ratePlanWS.listRatePlansByDomain(
                    domain,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        } catch (WSException e) {
            throw new RuntimeException("Erro ao listar rate plans", e);
        }
    }

    public void insertRatePlan(RatePlan ratePlan) {
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

    public void updateRatePlan(RatePlan ratePlan) {
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

    public void removeRatePlan(Integer idRatePlan) {
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
