package com.sippulse.soapadapter.service;

import com.sippulse.soapadapter.adapter.RatePlanClientAdapter;
import com.sippulse.soapadapter.client.ratePlanWS.RatePlan;
import com.sippulse.soapadapter.client.ratePlanWS.UserPrincipalDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatePlanService {

    private final RatePlanClientAdapter adapter;

    public RatePlanService(RatePlanClientAdapter adapter) {
        this.adapter = adapter;
    }

    public List<RatePlan> listRatePlansByDomain(String domain, UserPrincipalDTO principal) {
        return adapter.listRatePlansByDomain(domain, principal);
    }

    public void insertRatePlan(RatePlan ratePlan, UserPrincipalDTO principal) {
        adapter.insertRatePlan(ratePlan, principal);
    }

    public void updateRatePlan(RatePlan ratePlan, UserPrincipalDTO principal) {
        adapter.updateRatePlan(ratePlan, principal);
    }

    public void removeRatePlan(Integer idRatePlan, UserPrincipalDTO principal) {
        adapter.removeRatePlan(idRatePlan, principal);
    }
}
