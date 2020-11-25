package com.dysmorphis.sfgdi.controllers;

import com.dysmorphis.sfgdi.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorInjectedGreetingService()); // most preferred way!!! for dependency injection
        // do not forget to use final... :)
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}