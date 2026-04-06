package com.sippulse.soapadapter.exception;

/**
 * Exception thrown when a SOAP service call fails.
 * Replaces generic RuntimeException for better error handling and traceability.
 */
public class SoapServiceException extends RuntimeException {

    public SoapServiceException(String message) {
        super(message);
    }

    public SoapServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
