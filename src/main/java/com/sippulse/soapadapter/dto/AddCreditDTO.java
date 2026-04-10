package com.sippulse.soapadapter.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AddCreditDTO(
        @NotBlank
        String accountcode,

        @NotNull(message = "It must not be zero.")
        Double value,

        @NotBlank
        String obs
) {
}
