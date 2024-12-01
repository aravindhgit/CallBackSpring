package com.first.fromNone.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import service.CallBackService;

@RestController
@RequestMapping
public class CallBackController {

    private final CallBackService callbackService;

    // Constructor injection
    public CallBackController(CallBackService callbackService) {
        this.callbackService = callbackService;
    }

    @PostMapping("/callback/fcuspring")
    public ResponseEntity<String> handleCallback(@RequestBody String requestXml) {
        if (requestXml.isEmpty()) {
            return ResponseEntity.badRequest()
                .body("{ \"code\": \"400\", \"message\": \"Please provide proper input for CallBackFCU\", \"status\": \"Bad Request\" }");
        }

        if (requestXml == null || requestXml.trim().isEmpty()) {
            System.out.println("Invalid requestXml: " + requestXml);
            return ResponseEntity.badRequest().body("Invalid input");
        }


        try {
            // Asynchronously process the callback data
        	System.out.println("Received requestXml: " + requestXml);

        	System.out.println("INSIDE TRY");
            callbackService.processCallbackAsync(requestXml);
            
            return ResponseEntity.ok("{ \"status\": \"Success\", \"message\": \"Callback received and is being processed\" }");
        } catch (Exception e) {
            return ResponseEntity.status(500)
                .body("{ \"code\": \"500\", \"message\": \"Internal Server Error\", \"status\": \"Error\", Exception : "+e+"}");
        }
    }
}
