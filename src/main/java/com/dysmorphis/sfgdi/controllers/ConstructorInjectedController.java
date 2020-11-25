package com.dysmorphis.sfgdi.controllers;

import com.dysmorphis.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    @Autowired // annotation is optional when injecting with constructor
    public ConstructorInjectedController(@Qualifier("constructorInjectedGreetingService")GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return this.greetingService.sayGreeting();
    }


}

