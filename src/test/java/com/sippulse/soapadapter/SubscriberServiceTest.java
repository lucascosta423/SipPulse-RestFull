package com.sippulse.soapadapter;

import com.sippulse.soapadapter.service.SubscriberSoapToRestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SubscriberServiceTest {

    @Autowired
    private SubscriberSoapToRestService subscriberService;

    @Test
    void testAddCredit() throws Exception {
//        subscriberService.addCredit();
    }
}
