package com.sippulse.soapadapter.service;

import com.sippulse.soapadapter.adapter.RateClientAdapter;
import com.sippulse.soapadapter.client.rateWS.Rate;
import jakarta.xml.ws.Holder;
import org.springframework.stereotype.Service;

import java.util.List;

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
