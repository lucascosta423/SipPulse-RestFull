package com.sippulse.soapadapter.adapter;

import com.sippulse.soapadapter.client.domainWS.*;
import com.sippulse.soapadapter.mapper.SipPulseAuthMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DomainClientAdapter {

    private final DomainWS domainWS;
    private final SipPulseAuthMapper authMapper;

    public DomainClientAdapter(DomainWS domainWS, SipPulseAuthMapper authMapper) {
        this.domainWS = domainWS;
        this.authMapper = authMapper;
    }

    public List<Domain> listDomains(UserPrincipalDTO principal) {
        try {
            return domainWS.listDomains(
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        } catch (WSException e) {
            throw new RuntimeException("Erro ao listar domínios", e);
        }
    }
}
