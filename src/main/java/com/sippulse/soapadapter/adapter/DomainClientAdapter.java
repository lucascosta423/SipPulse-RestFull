package com.sippulse.soapadapter.adapter;

import com.sippulse.soapadapter.client.domainWS.*;
import com.sippulse.soapadapter.mapper.SoapAuthMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DomainClientAdapter {

    private final DomainWS domainWS;
    private final SoapAuthMapper authMapper;

    public DomainClientAdapter(DomainWS domainWS, SoapAuthMapper authMapper) {
        this.domainWS = domainWS;
        this.authMapper = authMapper;
    }

    public List<Domain> listDomains() {
        try {
            return domainWS.listDomains(
                    authMapper.toSoapUser(UserPrincipalDTO::new)
            );
        } catch (WSException e) {
            throw new RuntimeException("Erro ao listar domínios", e);
        }
    }
}
