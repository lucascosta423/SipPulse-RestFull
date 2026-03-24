package com.sippulse.soapadapter.controllers;

import com.sippulse.soapadapter.dto.ApiResponse;
import com.sippulse.soapadapter.service.ReloadModuleService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reload")
public class ReloadModuleController {
    private final ReloadModuleService reloadModuleService;

    public ReloadModuleController(ReloadModuleService reloadModuleService) {
        this.reloadModuleService = reloadModuleService;
    }

    @RequestMapping("/profile")
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

    @RequestMapping("/subscriber/{accountcode}")
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

    @RequestMapping("/did/{didId}")
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

    @RequestMapping("/address")
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

    @RequestMapping("/huntgroup/{huntGroupId}")
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
