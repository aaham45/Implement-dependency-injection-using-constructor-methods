package com.example.MyAppApplication.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String greet() {
        return "Hello from GreetingService!";
    }
}
