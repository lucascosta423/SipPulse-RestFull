package com.sippulse.soapadapter.service;

import com.sippulse.soapadapter.adapter.DomainClientAdapter;
import com.sippulse.soapadapter.client.domainWS.Domain;
import com.sippulse.soapadapter.client.domainWS.UserPrincipalDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DomainService {

    private final DomainClientAdapter adapter;

    public DomainService(DomainClientAdapter adapter) {
        this.adapter = adapter;
    }

    public List<Domain> listDomains(UserPrincipalDTO principal) {
        return adapter.listDomains(principal);
    }
}
