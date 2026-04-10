package com.sippulse.soapadapter.controller;

import com.sippulse.soapadapter.client.domainWS.Domain;
import com.sippulse.soapadapter.exception.GlobalExceptionHandler;
import com.sippulse.soapadapter.exception.SoapServiceException;
import com.sippulse.soapadapter.controllers.DidController;
import com.sippulse.soapadapter.controllers.DomainController;
import com.sippulse.soapadapter.service.DidService;
import com.sippulse.soapadapter.service.DomainService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * Combined controller and exception handler tests.
 */
@ExtendWith(MockitoExtension.class)
class ControllerTest {

    @Mock
    private DomainService domainService;

    @InjectMocks
    private DomainController domainController;

    @Mock
    private DidService didService;

    @InjectMocks
    private DidController didController;

    private final GlobalExceptionHandler handler = new GlobalExceptionHandler();

    // --- Domain Controller ---

    @Test
    void listDomains_shouldReturnOk() {
        doReturn(List.of(new Domain())).when(domainService).listDomains();

        MockHttpServletRequest request = new MockHttpServletRequest();
        var response = domainController.listDomains(request);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody().data()).hasSize(1);
    }

    // --- Did Controller ---

    @Test
    void listAvailableNumbers_shouldReturnOk() {
        doReturn(List.of("+551199999")).when(didService).listAvailableNumbers(anyString());

        MockHttpServletRequest request = new MockHttpServletRequest();
        var response = didController.listAvailableNumbers("example.com", request);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
    }

    // --- Global Exception Handler ---

    @Test
    void handleSoapServiceException_shouldReturn500() {
        var request = new MockHttpServletRequest("GET", "/test");
        var response = handler.handleSoapServiceException(new SoapServiceException("SOAP error"), request);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.INTERNAL_SERVER_ERROR);
        assertThat(response.getBody().message()).isEqualTo("SOAP service error");
    }

    @Test
    void handleRuntimeException_shouldReturn500() {
        var request = new MockHttpServletRequest("GET", "/test");
        var response = handler.handleRuntimeException(new RuntimeException("Generic"), request);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.INTERNAL_SERVER_ERROR);
        assertThat(response.getBody().message()).isEqualTo("Internal server error");
    }

    @Test
    void handleMalformedJson_shouldReturn400() {
        var request = new MockHttpServletRequest("GET", "/test");
        var response = handler.handleMalformedJson(new HttpMessageNotReadableException("Bad JSON"), request);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.BAD_REQUEST);
        assertThat(response.getBody().message()).isEqualTo("Malformed request body");
    }

    @Test
    void handleValidation_shouldReturn400WithErrors() {
        var request = new MockHttpServletRequest("GET", "/test");
        var bindingResult = new BeanPropertyBindingResult(new Object(), "object");
        bindingResult.addError(new FieldError("object", "username", "must not be blank"));

        var response = handler.handleValidation(new MethodArgumentNotValidException(null, bindingResult), request);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.BAD_REQUEST);
        assertThat(response.getBody().message()).isEqualTo("Validation error");
        assertThat(response.getBody().errors()).contains("username: must not be blank");
    }

    @Test
    void handleNoResource_shouldReturn404() {
        var request = new MockHttpServletRequest("GET", "/test");
        var response = handler.handleNoResource(new NoResourceFoundException(HttpMethod.GET, "/notfound"), request);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
    }
}
