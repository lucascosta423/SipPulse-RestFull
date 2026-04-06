package com.sippulse.soapadapter.service;

import com.sippulse.soapadapter.adapter.RatePlanClientAdapter;
import com.sippulse.soapadapter.client.ratePlanWS.RatePlan;
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
class RatePlanServiceTest {

    @Mock
    private RatePlanClientAdapter adapter;

    @InjectMocks
    private RatePlanService ratePlanService;

    @Test
    void listRatePlansByDomain_shouldReturnRatePlans() {
        doReturn(List.of(new RatePlan())).when(adapter).listRatePlansByDomain(anyString());

        var result = ratePlanService.listRatePlansByDomain("example.com");

        assertThat(result).hasSize(1);
    }

    @Test
    void insertRatePlan_shouldCallAdapter() {
        var rp = new RatePlan();
        doNothing().when(adapter).insertRatePlan(rp);

        ratePlanService.insertRatePlan(rp);

        verify(adapter).insertRatePlan(rp);
    }

    @Test
    void removeRatePlan_shouldCallAdapter() {
        doNothing().when(adapter).removeRatePlan(1);

        ratePlanService.removeRatePlan(1);

        verify(adapter).removeRatePlan(1);
    }
}
