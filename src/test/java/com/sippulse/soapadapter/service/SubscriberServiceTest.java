package com.sippulse.soapadapter.service;

import com.sippulse.soapadapter.adapter.SubscriberClientAdapter;
import com.sippulse.soapadapter.client.subscriberWS.SubscriberDTO;
import com.sippulse.soapadapter.exception.SoapServiceException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class SubscriberServiceTest {

    @Mock
    private SubscriberClientAdapter adapter;

    @InjectMocks
    private SubscriberService subscriberService;

    @Test
    void activateSubscriber_shouldCallAdapter() {
        doNothing().when(adapter).activateSubscriber("user", "domain.com");

        subscriberService.activateSubscriber("user@domain.com");

        verify(adapter).activateSubscriber("user", "domain.com");
    }

    @Test
    void blockSubscriber_shouldCallAdapter() {
        subscriberService.blockSubscriber("user@domain.com");

        verify(adapter).blockSubscriber("user", "domain.com");
    }

    @Test
    void retrieveSubscriber_shouldReturnDto() {
        var expected = new SubscriberDTO();
        doReturn(expected).when(adapter).retrieveSubscriber("user", "domain.com");

        var result = subscriberService.retrieveSubscriber("user@domain.com");

        assertThat(result).isSameAs(expected);
    }

    @Test
    void addCredit_shouldCallAdapter() {
        subscriberService.addCredit("user@domain.com", 10.0, "credit");

        verify(adapter).addCredit("user", "domain.com", 10.0, "credit");
    }
}
