package com.sippulse.soapadapter.controllers;

import com.sippulse.soapadapter.client.profileWS.Profile;
import com.sippulse.soapadapter.dto.ApiResponse;
import com.sippulse.soapadapter.service.ProfileService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


@RestController
@RequestMapping("/profile")
public class ProfileController {
    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping("/{domain}")
    public ResponseEntity<ApiResponse<List<Profile>>> listProfilesByDomain(@PathVariable String domain, HttpServletRequest request) {
        return ResponseEntity.ok().body(
                ApiResponse.success(
                        profileService.listProfilesByDomain(domain),
                        "Profiles Found",
                        200,
                        request.getRequestURI()
                )
        );
    }
}
