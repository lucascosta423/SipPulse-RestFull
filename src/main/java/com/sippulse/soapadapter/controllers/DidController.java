package com.sippulse.soapadapter.controllers;

import com.sippulse.soapadapter.dto.ApiResponse;
import com.sippulse.soapadapter.dto.DidDTO;
import com.sippulse.soapadapter.facade.SipPulseFacade;
import com.sippulse.soapadapter.service.DidService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/dids")
public class DidController {

    private final DidService didService;

    public DidController(DidService didService) {
        this.didService = didService;
    }

    @GetMapping("/available")
    public ResponseEntity<ApiResponse<List<String>>> listAvailablesNumbers(@RequestParam String domain, HttpServletRequest request) {
        return ResponseEntity.ok(
                ApiResponse.success(
                        didService.listAvailablesNumbers(domain),
                        "Available Dids",
                        HttpStatus.OK.value(),
                        request.getRequestURI()
                )
        );
    }

    @GetMapping
    public ResponseEntity<ApiResponse<List<DidDTO>>> listByAcc(@RequestParam String accountcode, HttpServletRequest request) {
        return ResponseEntity.ok(
                ApiResponse.success(
                        didService.listByAcc(accountcode),
                        "Dids Found",
                        HttpStatus.OK.value(),
                        request.getRequestURI()
                )
        );
    }

    @PostMapping
    public ResponseEntity<ApiResponse<Integer>> insertDid(@RequestBody DidDTO didDTO,HttpServletRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(
                ApiResponse.success(
                        didService.insertDid(didDTO),
                        "Did Registered",
                        HttpStatus.CREATED.value(),
                        request.getRequestURI()
                )
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<Void>> deleteDid(@PathVariable Integer id,HttpServletRequest request) {

        didService.deleteDid(id);

        return ResponseEntity.ok(
                ApiResponse.success(
                        null,
                        "Did Deleted",
                        HttpStatus.NO_CONTENT.value(),
                        request.getRequestURI()
                )
        );
    }
}
