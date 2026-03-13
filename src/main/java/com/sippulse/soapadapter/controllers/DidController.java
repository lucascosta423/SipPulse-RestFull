package com.sippulse.soapadapter.controllers;

import com.sippulse.soapadapter.dto.DidDTO;
import com.sippulse.soapadapter.service.DidSoapToRestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dids")
public class DidController {

    private final DidSoapToRestService didSoapToRestService;

    public DidController(DidSoapToRestService didSoapToRestService) {
        this.didSoapToRestService = didSoapToRestService;
    }

    @GetMapping("/available")
    public ResponseEntity<List<String>> listAvailablesNumbers(@RequestParam String domain) {
        return ResponseEntity.ok(
                didSoapToRestService.listAvailablesNumbers(domain)
        );
    }

    @GetMapping
    public ResponseEntity<List<DidDTO>> listByAcc(@RequestParam String accountcode) {
        return ResponseEntity.ok(
                didSoapToRestService.listByAcc(accountcode)
        );
    }

    @PostMapping
    public ResponseEntity<Integer> insertDid(@RequestBody DidDTO didDTO) {
        Integer id = didSoapToRestService.insertDid(didDTO);
        return ResponseEntity.ok(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDid(@PathVariable Integer id) {

        didSoapToRestService.deleteDid(id);

        return ResponseEntity.noContent().build();
    }
}