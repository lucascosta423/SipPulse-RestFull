package com.sippulse.soapadapter.adapter;

import com.sippulse.soapadapter.exception.SoapServiceException;
import com.sippulse.soapadapter.client.rateWS.Rate;
import com.sippulse.soapadapter.client.rateWS.RateWS;
import com.sippulse.soapadapter.client.rateWS.UserPrincipalDTO;
import com.sippulse.soapadapter.client.rateWS.WSException;
import com.sippulse.soapadapter.mapper.SoapAuthMapper;
import jakarta.xml.ws.Holder;
import org.springframework.stereotype.Component;

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


@Component
public class RateClientAdapter{

    private final RateWS rateWS;
    private final SoapAuthMapper authMapper;


    public RateClientAdapter(RateWS rateWS, SoapAuthMapper authMapper) {
        this.rateWS = rateWS;
        this.authMapper = authMapper;
    }

    public List<Rate> listRatesByParams(String domain, String descripion, Integer rateId, String prefix) {
        try{
            return rateWS.listRatesByParams(
                    domain,
                    descripion,
                    rateId,
                    prefix,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Error listing rates.",e);
        }
    }

    public int removeAllRatesByRateId(String domain, Integer rateId) {
        try{
            return rateWS.removeAllRatesByRateId(
                    domain,
                    rateId,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Error removing all rates by rate id.",e);
        }
    }

    public void removeRate(Integer id) {
        try{
            rateWS.removeRate(
                    id,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Error removing rate.",e);
        }
    }

    public void updateRate(Holder<Rate> rate) {
        try{
            rateWS.updateRate(
                    rate,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new SoapServiceException("Error updating rate.",e);
        }
    }

    public void insertRates(List<Rate> rate) {
        try {
            rateWS.insertRates(
                    rate,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        } catch (WSException e) {
            throw new SoapServiceException("Error inserting rates.",e);
        }
    }
}
