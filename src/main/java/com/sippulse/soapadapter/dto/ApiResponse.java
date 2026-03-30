package com.sippulse.soapadapter.dto;

import java.time.LocalDateTime;
import java.util.List;

/**
 * SipPulse-RestFull
 * Copyright (C) 2026
 * <p>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <a href="https://www.gnu.org/licenses/">gnu</a>.
 */


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
