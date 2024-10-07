package com.colak.springtutorial.controller;

import com.colak.springtutorial.producer.MessageProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
public class IntegrationController {

    private final MessageProducer messageProducer;

    // http://localhost:8080/api/integration-external-call
    @GetMapping("/integration-external-call")
    public ResponseEntity<Object> externalCall() {
        String message = "covid";
        return ResponseEntity.ok(messageProducer.externalCall(message));
    }

}
