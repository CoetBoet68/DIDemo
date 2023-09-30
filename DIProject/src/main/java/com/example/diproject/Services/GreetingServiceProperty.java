package com.example.diproject.Services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceProperty implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World Property";
    }
}
