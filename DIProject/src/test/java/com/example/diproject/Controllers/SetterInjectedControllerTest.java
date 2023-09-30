package com.example.diproject.Controllers;

import com.example.diproject.Services.GreetingServiceConstructor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceConstructor());
    }
    @Test
    void getGreeting(){
        System.out.println(controller.getGreeting());
    }
}
