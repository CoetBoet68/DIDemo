package com.example.diproject.Services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceSetter implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World Setter";
    }
}
