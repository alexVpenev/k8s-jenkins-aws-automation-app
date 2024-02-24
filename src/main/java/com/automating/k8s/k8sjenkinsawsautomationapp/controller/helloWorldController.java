package com.automating.k8s.k8sjenkinsawsautomationapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldController {
    @GetMapping("/")
    public String helloWorld() {
        return "Hello There DUMBASSSS MATAFAKAAAAAA nooov addition!";
    }
}
