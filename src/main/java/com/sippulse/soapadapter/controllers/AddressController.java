package com.sippulse.soapadapter.controllers;

import com.sippulse.soapadapter.client.addressWS.Address;
import com.sippulse.soapadapter.dto.AddressDTO;
import com.sippulse.soapadapter.dto.ApiResponse;
import com.sippulse.soapadapter.service.AddressService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
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


@RestController
@RequestMapping("/address")
public class AddressController {
    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("/{accountcode}")
    public ResponseEntity<ApiResponse<List<Address>>> listAddresses(@PathVariable String accountcode,HttpServletRequest request){
        return ResponseEntity.ok().body(
                ApiResponse.success(
                        addressService.listAddresses(accountcode),
                        "Addresses Found",
                        HttpStatus.OK.value(),
                        request.getRequestURI()
                )
        );
    }


    @PostMapping
    public ResponseEntity<ApiResponse<Address>> insertAddress(@RequestBody @Valid AddressDTO addressDTO, HttpServletRequest request){

        return ResponseEntity.status(HttpStatus.CREATED).body(
                ApiResponse.success(
                        addressService.insertAddress(addressDTO),
                        "Address added",
                        HttpStatus.CREATED.value(),
                        request.getRequestURI()
                )
        );
    }

    @PatchMapping
    public ResponseEntity<ApiResponse<Address>> updateAddress(@RequestBody @Valid AddressDTO addressDTO, HttpServletRequest request){

        return ResponseEntity.ok().body(
                ApiResponse.success(
                        addressService.updateAddress(addressDTO),
                        "Updated Address",
                        HttpStatus.OK.value(),
                        request.getRequestURI()
                )
        );
    }

    @DeleteMapping("/{domain}/{id}")
    public ResponseEntity<ApiResponse<Void>> removeAddress(
            @PathVariable String domain, @PathVariable Integer id,HttpServletRequest request)
    {
        addressService.removeAddress(domain,id);
        return ResponseEntity.ok().body(
                ApiResponse.success(
                        null,
                        "Address Removed",
                        HttpStatus.OK.value(),
                        request.getRequestURI()
                )
        );
    }

}
