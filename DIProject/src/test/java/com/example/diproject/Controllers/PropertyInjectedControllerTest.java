package com.example.diproject.Controllers;

import com.example.diproject.Services.GreetingServiceConstructor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {
    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingService = new GreetingServiceConstructor();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}