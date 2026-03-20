package com.sippulse.soapadapter.controllers;

import com.sippulse.soapadapter.dto.ApiResponse;
import com.sippulse.soapadapter.dto.DidDTO;
import com.sippulse.soapadapter.facade.SipPulseFacade;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dids")
public class DidController {

    private final SipPulseFacade sipPulseFacade;
    
    public DidController(SipPulseFacade sipPulseFacade) {
        this.sipPulseFacade = sipPulseFacade;
    }

    @GetMapping("/available")
    public ResponseEntity<ApiResponse> listAvailablesNumbers(@RequestParam String domain, HttpServletRequest request) {
        return ResponseEntity.ok(
                ApiResponse.success(
                        sipPulseFacade.listAvailablesNumbers(domain),
                        "Dids Disponiveis",
                        HttpStatus.OK.value(),
                        request.getRequestURI()
                )
        );
    }

    @GetMapping
    public ResponseEntity<ApiResponse> listByAcc(@RequestParam String accountcode, HttpServletRequest request) {
        return ResponseEntity.ok(
                ApiResponse.success(
                        sipPulseFacade.listByAcc(accountcode),
                        "Dids Encontrados",
                        HttpStatus.OK.value(),
                        request.getRequestURI()
                )
        );
    }

    @PostMapping
    public ResponseEntity<ApiResponse> insertDid(@RequestBody DidDTO didDTO,HttpServletRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(
                ApiResponse.success(
                        sipPulseFacade.insertDid(didDTO),
                        "Did Cadastrado",
                        HttpStatus.CREATED.value(),
                        request.getRequestURI()
                )
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse> deleteDid(@PathVariable Integer id,HttpServletRequest request) {

        sipPulseFacade.deleteDid(id);

        return ResponseEntity.ok(
                ApiResponse.success(
                        null,
                        "Did Deletado",
                        HttpStatus.NO_CONTENT.value(),
                        request.getRequestURI()
                )
        );
    }
}