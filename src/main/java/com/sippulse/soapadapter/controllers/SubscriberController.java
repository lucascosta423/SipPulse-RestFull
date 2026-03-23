package com.sippulse.soapadapter.controllers;

import com.sippulse.soapadapter.dto.SubscriberMinDTO;
import com.sippulse.soapadapter.facade.SipPulseFacade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subscriber")
public class SubscriberController {

    private final SipPulseFacade sipPulseFacade;

    public SubscriberController(SipPulseFacade sipPulseFacade) {
        this.sipPulseFacade = sipPulseFacade;
    }

    //Get

    //Post
    @PostMapping
    public ResponseEntity<Integer> insertSubscriber(@RequestBody SubscriberMinDTO subscriberMinDTO) {
        Integer id = sipPulseFacade.insertSubscriber(subscriberMinDTO);
        return ResponseEntity.ok(id);
    }

    @PostMapping( "/withdid")
    public ResponseEntity<Integer> insertSubscriberWithDid(@RequestBody SubscriberMinDTO subscriberMinDTO) {
        Integer id = sipPulseFacade.insertSubscriberWithDid(subscriberMinDTO);
        return ResponseEntity.ok(id);
    }

    //Patch
    @PatchMapping("/{accountcode}/active")
    public ResponseEntity<Void> activateSubscriber(@PathVariable String accountcode) {
        sipPulseFacade.activateSubscriber(accountcode);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{accountcode}/block")
    public ResponseEntity<Void> blockSubscriber(@PathVariable String accountcode) {
        sipPulseFacade.blockSubscriber(accountcode);
        return ResponseEntity.noContent().build();
    }

    //Delete

}
