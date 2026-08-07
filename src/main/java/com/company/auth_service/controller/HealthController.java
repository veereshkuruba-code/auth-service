package com.company.auth_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HealthController {

    @GetMapping("/")
    public Map<String, String> home() {
        return Map.of(
                "service", "auth-service",
                "status", "running"
        );
    }
    @GetMapping("/hello")
    public String hello() {
        return "Hello from auth-service...!";
    }
}