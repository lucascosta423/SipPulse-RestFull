package com.sippulse.soapadapter.utils;

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


public record AccountCodeUtils(String username, String domain) {
    public static AccountCodeUtils from(String accountcode) {
        if (accountcode == null || !accountcode.contains("@")) {
            throw new IllegalArgumentException("accountcode inválido: " + accountcode);
        }

        String[] parts = accountcode.split("@", 2);
        return new AccountCodeUtils(parts[0], parts[1]);
    }
}
