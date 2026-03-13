package com.sippulse.soapadapter;

import com.sippulse.soapadapter.sippulse.client.didWS.WSException;
import com.sippulse.soapadapter.service.DidSoapToRestService;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class DidSoapToRestServiceTest {

    @Autowired
    private DidSoapToRestService didSoapToRestService;
    private static final Logger log = LoggerFactory.getLogger(DidSoapToRestServiceTest.class);

    @Test
    void testListDid() throws WSException {
        String accountcode = "2728880000@181.191.207.100";
        var result = didSoapToRestService.listByAcc(accountcode);

        assertNotNull(result);
        assertFalse(result.isEmpty());
    }


}
