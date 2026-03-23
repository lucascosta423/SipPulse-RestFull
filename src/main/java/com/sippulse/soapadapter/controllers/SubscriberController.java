package com.sippulse.soapadapter.controllers;

import com.sippulse.soapadapter.dto.ApiResponse;
import com.sippulse.soapadapter.dto.SubscriberMinDTO;
import com.sippulse.soapadapter.facade.SipPulseFacade;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

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
    public ResponseEntity<ApiResponse<Integer>> insertSubscriber(@RequestBody SubscriberMinDTO subscriberMinDTO, HttpServletRequest request) {
          return ResponseEntity.status(HttpStatus.CREATED).body(
                ApiResponse.success(
                        sipPulseFacade.insertSubscriber(subscriberMinDTO),
                        "Registered Subscriber",
                        HttpStatus.CREATED.value(),
                        request.getRequestURI()
                )
        );
    }

    @PostMapping( "/withdid")
    public ResponseEntity<ApiResponse<Map<String,Integer>>> insertSubscriberWithDid(@RequestBody SubscriberMinDTO subscriberMinDTO, HttpServletRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(
                ApiResponse.success(
                        sipPulseFacade.insertSubscriberWithDid(subscriberMinDTO),
                        "Subscriber and Registered",
                        HttpStatus.CREATED.value(),
                        request.getRequestURI()
                )
        );
    }

    //Patch
    @PatchMapping("/{accountcode}/active")
    public ResponseEntity<ApiResponse<Void>> activateSubscriber(@PathVariable String accountcode,HttpServletRequest request) {

        sipPulseFacade.activateSubscriber(accountcode);

        return ResponseEntity.status(HttpStatus.OK).body(
                ApiResponse.success(
                       null,
                        "Subscriber Activated",
                        HttpStatus.CREATED.value(),
                        request.getRequestURI()
                )
        );
    }

    @PatchMapping("/{accountcode}/block")
    public ResponseEntity<ApiResponse<Void>> blockSubscriber(@PathVariable String accountcode, HttpServletRequest request) {
        sipPulseFacade.blockSubscriber(accountcode);
        return ResponseEntity.status(HttpStatus.OK).body(
                ApiResponse.success(
                        null,
                        "Blocked Subscriber",
                        HttpStatus.CREATED.value(),
                        request.getRequestURI()
                )
        );
    }

    //Delete

}
