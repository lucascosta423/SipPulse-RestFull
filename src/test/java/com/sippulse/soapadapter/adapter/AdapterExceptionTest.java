package com.sippulse.soapadapter.adapter;

import com.sippulse.soapadapter.exception.SoapServiceException;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * Simple tests that verify SoapServiceException is correctly thrown
 * and behaves as expected across the application.
 */
class AdapterExceptionTest {

    @Test
    void soapServiceException_shouldHaveMessage() {
        var ex = new SoapServiceException("Test error");

        assertThat(ex.getMessage()).isEqualTo("Test error");
        assertThat(ex.getCause()).isNull();
        assertThat(ex).isInstanceOf(RuntimeException.class);
    }

    @Test
    void soapServiceException_shouldHaveCause() {
        var cause = new RuntimeException("Root cause");
        var ex = new SoapServiceException("Wrapper", cause);

        assertThat(ex.getMessage()).isEqualTo("Wrapper");
        assertThat(ex.getCause()).isSameAs(cause);
    }
}
