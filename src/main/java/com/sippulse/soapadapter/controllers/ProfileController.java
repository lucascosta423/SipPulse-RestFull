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
