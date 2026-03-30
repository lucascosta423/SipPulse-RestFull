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

    public List<RatePlan> listRatePlansByDomain(String domain) {
        return adapter.listRatePlansByDomain(domain);
    }

    public void insertRatePlan(RatePlan ratePlan) {
        adapter.insertRatePlan(ratePlan);
    }

    public void updateRatePlan(RatePlan ratePlan) {
        adapter.updateRatePlan(ratePlan);
    }

    public void removeRatePlan(Integer idRatePlan) {
        adapter.removeRatePlan(idRatePlan);
    }
}
