package com.example.MyAppApplication.component;

import com.example.MyAppApplication.service.GreetingService;
import org.springframework.stereotype.Component;

@Component
public class GreetingController {

    private final GreetingService greetingService;

    // Constructor-based Dependency Injection
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void showGreeting() {
        System.out.println(greetingService.greet());
    }
}
