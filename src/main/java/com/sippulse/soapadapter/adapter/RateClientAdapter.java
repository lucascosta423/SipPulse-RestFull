package com.sippulse.soapadapter.adapter;

import com.sippulse.soapadapter.client.rateWS.Rate;
import com.sippulse.soapadapter.client.rateWS.RateWS;
import com.sippulse.soapadapter.client.rateWS.UserPrincipalDTO;
import com.sippulse.soapadapter.client.rateWS.WSException;
import com.sippulse.soapadapter.mapper.SoapAuthMapper;
import jakarta.xml.ws.Holder;
import org.springframework.stereotype.Component;

import java.util.List;

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
            throw new RuntimeException("Error listing rates.",e);
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
            throw new RuntimeException("Error removing all rates by rate id.",e);
        }
    }

    public void removeRate(Integer id) {
        try{
            rateWS.removeRate(
                    id,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new RuntimeException("Error removing rate.",e);
        }
    }

    public void updateRate(Holder<Rate> rate) {
        try{
            rateWS.updateRate(
                    rate,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        }catch (WSException e){
            throw new RuntimeException("Error updating rate.",e);
        }
    }

    public void insertRates(List<Rate> rate) {
        try {
            rateWS.insertRates(
                    rate,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        } catch (WSException e) {
            throw new RuntimeException("Error inserting rates.",e);
        }
    }
}
