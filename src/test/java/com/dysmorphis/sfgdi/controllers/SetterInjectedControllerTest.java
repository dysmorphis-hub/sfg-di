package com.dysmorphis.sfgdi.controllers;

import com.dysmorphis.sfgdi.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {

        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorInjectedGreetingService()); // debatable way through setter
    }

    @Test
    void getGreetingService() {

        System.out.println(controller.getGreetingService());
    }
}