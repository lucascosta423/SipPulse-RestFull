package com.sippulse.soapadapter.controllers;

import com.sippulse.soapadapter.dto.DidDTO;
import com.sippulse.soapadapter.facade.SipPulseFacade;
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
    public ResponseEntity<List<String>> listAvailablesNumbers(@RequestParam String domain) {
        return ResponseEntity.ok(
                sipPulseFacade.listAvailablesNumbers(domain)
        );
    }

    @GetMapping
    public ResponseEntity<List<DidDTO>> listByAcc(@RequestParam String accountcode) {
        return ResponseEntity.ok(
                sipPulseFacade.listByAcc(accountcode)
        );
    }

    @PostMapping
    public ResponseEntity<Integer> insertDid(@RequestBody DidDTO didDTO) {
        Integer id = sipPulseFacade.insertDid(didDTO);
        return ResponseEntity.ok(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDid(@PathVariable Integer id) {

        sipPulseFacade.deleteDid(id);

        return ResponseEntity.noContent().build();
    }
}