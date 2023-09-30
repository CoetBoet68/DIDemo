package com.example.diproject.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class GreetingServiceConstructor implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World Constructor";
    }
}
