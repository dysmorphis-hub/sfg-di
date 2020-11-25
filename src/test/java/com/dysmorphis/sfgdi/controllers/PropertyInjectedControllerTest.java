package com.dysmorphis.sfgdi.controllers;

import com.dysmorphis.sfgdi.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp(){

        controller = new PropertyInjectedController();

        controller.greetingService = new ConstructorInjectedGreetingService();  // the least preferred way


    }

    @Test
    void getGreeting(){
        System.out.println(controller.getGreeting());
    }

}