package com.sippulse.soapadapter.service;

import com.sippulse.soapadapter.adapter.RateClientAdapter;
import com.sippulse.soapadapter.client.rateWS.Rate;
import jakarta.xml.ws.Holder;
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
public class RateService {
    private final RateClientAdapter adapter;

    public RateService(RateClientAdapter adapter) {
        this.adapter = adapter;
    }

    public List<Rate> listRatesByParams(String domain, String descripion, Integer rateId, String prefix) {
        return adapter.listRatesByParams(domain, descripion, rateId, prefix);
    }

    public int removeAllRatesByRateId(String domain, Integer rateId) {
       return adapter.removeAllRatesByRateId(domain, rateId);
    }

    public void removeRate(Integer id) {
       adapter.removeRate(id);
    }

    public void updateRate(Holder<Rate> rate) {
        adapter.updateRate(rate);
    }

    public void insertRates(List<Rate> rate) {
        adapter.insertRates(rate);
    }
}
