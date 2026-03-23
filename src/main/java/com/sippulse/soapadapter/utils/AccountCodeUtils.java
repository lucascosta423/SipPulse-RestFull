package com.sippulse.soapadapter.utils;

public record AccountCodeUtils(String username, String domain) {
    public static AccountCodeUtils from(String accountcode) {
        if (accountcode == null || !accountcode.contains("@")) {
            throw new IllegalArgumentException("accountcode inválido: " + accountcode);
        }

        String[] parts = accountcode.split("@", 2);
        return new AccountCodeUtils(parts[0], parts[1]);
    }
}
