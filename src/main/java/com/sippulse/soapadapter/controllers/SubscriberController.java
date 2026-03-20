package com.sippulse.soapadapter.controllers;

import com.sippulse.soapadapter.dto.SubscriberMinDTO;
import com.sippulse.soapadapter.facade.SipPulseFacade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    //Put

    //Delete

}
