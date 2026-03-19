package com.sippulse.soapadapter.adapter;

import com.sippulse.soapadapter.client.huntGroupWS.*;
import com.sippulse.soapadapter.mapper.SipPulseAuthMapper;
import jakarta.xml.ws.Holder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HuntGroupClientAdapter {

    private final HuntGroupWS huntGroupWS;
    private final SipPulseAuthMapper authMapper;

    public HuntGroupClientAdapter(HuntGroupWS huntGroupWS, SipPulseAuthMapper authMapper) {
        this.huntGroupWS = huntGroupWS;
        this.authMapper = authMapper;
    }

    public List<HuntGroup> listHuntGroups(String domain, UserPrincipalDTO principal) {
        try {
            return huntGroupWS.listHuntGroups(
                    domain,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        } catch (WSException e) {
            throw new RuntimeException("Erro ao listar hunt groups", e);
        }
    }

    public void insertHuntGroup(HuntGroup huntGroup, UserPrincipalDTO principal) {
        try {
            Holder<HuntGroup> holder = new Holder<>(huntGroup);
            huntGroupWS.insertHuntGroup(
                    holder,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        } catch (WSException e) {
            throw new RuntimeException("Erro ao inserir hunt group", e);
        }
    }

    public void updateHuntGroup(HuntGroup huntGroup, UserPrincipalDTO principal) {
        try {
            Holder<HuntGroup> holder = new Holder<>(huntGroup);
            huntGroupWS.updateHuntGroup(
                    holder,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        } catch (WSException e) {
            throw new RuntimeException("Erro ao atualizar hunt group", e);
        }
    }

    public void removeHuntGroup(String domain, Integer huntGroupId, UserPrincipalDTO principal) {
        try {
            huntGroupWS.removeHuntGroup(
                    domain,
                    huntGroupId,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        } catch (WSException e) {
            throw new RuntimeException("Erro ao remover hunt group", e);
        }
    }
}
