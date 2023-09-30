package com.example.diproject.Controllers;

import static org.junit.jupiter.api.Assertions.*;

import com.example.diproject.Services.GreetingService;
import com.example.diproject.Services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImpl());
    }
    @Test
    void getGreeting(){
        System.out.println(controller.getGreeting());
    }
}
