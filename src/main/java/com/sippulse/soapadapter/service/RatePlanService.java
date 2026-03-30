package com.sippulse.soapadapter.service;

import com.sippulse.soapadapter.adapter.RatePlanClientAdapter;
import com.sippulse.soapadapter.client.ratePlanWS.RatePlan;
import com.sippulse.soapadapter.client.ratePlanWS.UserPrincipalDTO;
import org.springframework.stereotype.Service;

import java.util.List;

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
