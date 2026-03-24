package com.sippulse.soapadapter.controllers;

import com.sippulse.soapadapter.client.domainWS.Domain;
import com.sippulse.soapadapter.dto.ApiResponse;
import com.sippulse.soapadapter.service.DomainService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/domain")
public class DomainController {

    private final DomainService domainService;

    public DomainController(DomainService domainService) {
        this.domainService = domainService;
    }

    @GetMapping
    public ResponseEntity<ApiResponse<List<Domain>>> listDomains(HttpServletRequest request) {
        return ResponseEntity.ok(
                ApiResponse.success(
                        domainService.listDomains(),
                        "Finded Domains",
                        HttpStatus.OK.value(),
                        request.getRequestURI()
                )
        );
    }
}
