package com.sippulse.soapadapter.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;
import java.util.List;

public record ApiResponse<T>(
        LocalDateTime timestamp,
        int status,
        boolean success,
        String message,
        T data,
        List<String> errors,
        String path
) {

    public static <T> ApiResponse<T> success(T data, String message, int status, String path) {
        return new ApiResponse<>(LocalDateTime.now(), status, true, message, data, null, path);
    }

    public static <T> ApiResponse<T> error(String message, List<String> errors, int status, String path) {
        return new ApiResponse<>(LocalDateTime.now(), status, false, message, null, errors, path);
    }
}
