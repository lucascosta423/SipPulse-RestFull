package com.sippulse.soapadapter.controllers;

import com.sippulse.soapadapter.client.addressWS.Address;
import com.sippulse.soapadapter.dto.ApiResponse;
import com.sippulse.soapadapter.service.AddressService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("/{accountcode}")
    public ResponseEntity<ApiResponse<List<Address>>> lisAddresses(@PathVariable String accountcode,HttpServletRequest request){
        return ResponseEntity.ok().body(
                ApiResponse.success(
                        addressService.lisAddresses(accountcode),
                        "Addresses Found",
                        HttpStatus.OK.value(),
                        request.getRequestURI()
                )
        );
    }


    @PostMapping
    public ResponseEntity<ApiResponse<Void>> insertAddress(HttpServletRequest request){

        return ResponseEntity.status(HttpStatus.CREATED).body(
                ApiResponse.success(
                        null,
                        "Address added",
                        HttpStatus.CREATED.value(),
                        request.getRequestURI()
                )
        );
    }

    @PatchMapping
    public ResponseEntity<ApiResponse<Void>> updateAddress(HttpServletRequest request){

        return ResponseEntity.ok().body(
                ApiResponse.success(
                        null,
                        "Updated Address",
                        HttpStatus.OK.value(),
                        request.getRequestURI()
                )
        );
    }

    @DeleteMapping
    public ResponseEntity<ApiResponse<Void>> removeAddress(HttpServletRequest request){
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
