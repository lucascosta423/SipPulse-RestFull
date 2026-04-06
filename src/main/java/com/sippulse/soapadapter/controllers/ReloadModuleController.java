package com.sippulse.soapadapter.controllers;

import com.sippulse.soapadapter.dto.ApiResponse;
import com.sippulse.soapadapter.service.ReloadModuleService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("/reload")
public class ReloadModuleController {
    private final ReloadModuleService reloadModuleService;

    public ReloadModuleController(ReloadModuleService reloadModuleService) {
        this.reloadModuleService = reloadModuleService;
    }

    @PostMapping("/profile")
    public ResponseEntity<ApiResponse<Void>> reloadProfile(String profile, String domain, HttpServletRequest request){
        reloadModuleService.reloadProfile(profile, domain);
        return ResponseEntity.ok(
                ApiResponse.success(
                        null,
                        "Profile reloaded",
                        HttpStatus.OK.value(),
                        request.getRequestURI()
                )
        );
    }

    @PostMapping("/subscriber/{accountcode}")
    public ResponseEntity<ApiResponse<Void>> reloadSubscriber(@PathVariable String accountcode, HttpServletRequest request){
        reloadModuleService.reloadSubscriber(accountcode);
        return ResponseEntity.ok(
                ApiResponse.success(
                        null,
                        "Subscriber reloaded",
                        HttpStatus.OK.value(),
                        request.getRequestURI()
                )
        );
    }

    @PostMapping("/did/{didId}")
    public ResponseEntity<ApiResponse<Void>> reloadDid(@PathVariable Integer didId, HttpServletRequest request){
        reloadModuleService.reloadDid(didId);
        return ResponseEntity.ok(
                ApiResponse.success(
                        null,
                        "Did reloaded",
                        HttpStatus.OK.value(),
                        request.getRequestURI()
                )
        );
    }

    @PostMapping("/address")
    public ResponseEntity<ApiResponse<Void>> reloadAddress(HttpServletRequest request){
        return ResponseEntity.ok(
                ApiResponse.success(
                        null,
                        "Address reloaded",
                        HttpStatus.OK.value(),
                        request.getRequestURI()
                )
        );
    }

    @PostMapping("/huntgroup/{huntGroupId}")
    public ResponseEntity<ApiResponse<Void>> reloadHuntGroup(@PathVariable Integer huntGroupId, HttpServletRequest request){
        reloadModuleService.reloadHuntGroup(huntGroupId);
        return ResponseEntity.ok(
                ApiResponse.success(
                        null,
                        "HuntGroup reloaded",
                        HttpStatus.OK.value(),
                        request.getRequestURI()
                )
        );
    }

}
