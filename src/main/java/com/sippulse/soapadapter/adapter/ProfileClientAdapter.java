package com.sippulse.soapadapter.adapter;

import com.sippulse.soapadapter.client.profileWS.*;
import com.sippulse.soapadapter.mapper.SipPulseAuthMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProfileClientAdapter {

    private final ProfileWS profileWS;
    private final SipPulseAuthMapper authMapper;

    public ProfileClientAdapter(ProfileWS profileWS, SipPulseAuthMapper authMapper) {
        this.profileWS = profileWS;
        this.authMapper = authMapper;
    }

    public List<Profile> listProfilesByDomain(String domain, UserPrincipalDTO principal) {
        try {
            return profileWS.listProfilesByDomain(
                    domain,
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        } catch (WSException e) {
            throw new RuntimeException("Erro ao listar profiles por domínio", e);
        }
    }
}
