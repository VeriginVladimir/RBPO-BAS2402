package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String hello() {
        return "Привет, мир! Spring Boot работает.";
    }

    @GetMapping("/api/number")
    public int number() {
        return 42;
    }
}