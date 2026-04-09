package com.sippulse.soapadapter.service;

import com.sippulse.soapadapter.adapter.DomainClientAdapter;
import com.sippulse.soapadapter.client.domainWS.Domain;
import com.sippulse.soapadapter.exception.SoapServiceException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class DomainServiceTest {

    @Mock
    private DomainClientAdapter adapter;

    @InjectMocks
    private DomainService domainService;

    @Test
    void listDomains_shouldReturnDomains() {
        Domain domain = new Domain();
        doReturn(List.of(domain)).when(adapter).listDomains();

        var result = domainService.listDomains();

        assertThat(result).hasSize(1);
    }

    @Test
    void listDomains_shouldThrowSoapServiceException() {
        doThrow(new SoapServiceException("Erro ao listar domínios")).when(adapter).listDomains();

        assertThatThrownBy(() -> domainService.listDomains())
                .isInstanceOf(SoapServiceException.class)
                .hasMessage("Erro ao listar domínios");
    }
}
