package com.sippulse.soapadapter.controllers;

import com.sippulse.soapadapter.dto.ApiResponse;
import com.sippulse.soapadapter.dto.SubscriberMinDTO;
import com.sippulse.soapadapter.service.SubscriberService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/subscriber")
public class SubscriberController {

    private final SubscriberService subscriberService;


    public SubscriberController(SubscriberService subscriberService) {
        this.subscriberService = subscriberService;
    }

    @PostMapping
    public ResponseEntity<ApiResponse<Integer>> insertSubscriber(@RequestBody @Valid SubscriberMinDTO subscriberMinDTO, HttpServletRequest request) {
          return ResponseEntity.status(HttpStatus.CREATED).body(
                ApiResponse.success(
                        subscriberService.insertSubscriber(subscriberMinDTO),
                        "Registered Subscriber",
                        HttpStatus.CREATED.value(),
                        request.getRequestURI()
                )
        );
    }

    @PatchMapping("/{accountcode}/active")
    public ResponseEntity<ApiResponse<Void>> activateSubscriber(@PathVariable String accountcode,HttpServletRequest request) {

        subscriberService.activateSubscriber(accountcode);

        return ResponseEntity.status(HttpStatus.OK).body(
                ApiResponse.success(
                       null,
                        "Subscriber Activated",
                        HttpStatus.OK.value(),
                        request.getRequestURI()
                )
        );
    }

    @PatchMapping("/{accountcode}/block")
    public ResponseEntity<ApiResponse<Void>> blockSubscriber(@PathVariable String accountcode, HttpServletRequest request) {
        subscriberService.blockSubscriber(accountcode);
        return ResponseEntity.status(HttpStatus.OK).body(
                ApiResponse.success(
                        null,
                        "Blocked Subscriber",
                        HttpStatus.OK.value(),
                        request.getRequestURI()
                )
        );
    }
}
