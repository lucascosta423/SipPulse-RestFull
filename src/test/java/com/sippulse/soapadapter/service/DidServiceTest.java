package com.sippulse.soapadapter.service;

import com.sippulse.soapadapter.adapter.DidClientAdapter;
import com.sippulse.soapadapter.dto.DidDTO;
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
class DidServiceTest {

    @Mock
    private DidClientAdapter didClientAdapter;

    @InjectMocks
    private DidService didService;

    @Test
    void listAvailableNumbers_shouldReturnNumbers() {
        doReturn(List.of("+551199999", "+551188888")).when(didClientAdapter).listAvailablesNumbers(anyString());

        var result = didService.listAvailableNumbers("example.com");

        assertThat(result).hasSize(2);
    }

    @Test
    void listAvailableNumbers_shouldThrowSoapServiceException() {
        doThrow(new SoapServiceException("Erro")).when(didClientAdapter).listAvailablesNumbers(anyString());

        assertThatThrownBy(() -> didService.listAvailableNumbers("example.com"))
                .isInstanceOf(SoapServiceException.class);
    }

    @Test
    void deleteDid_shouldCallAdapter() {
        didService.deleteDid(5);

        verify(didClientAdapter).deleteDid(5);
    }
}
