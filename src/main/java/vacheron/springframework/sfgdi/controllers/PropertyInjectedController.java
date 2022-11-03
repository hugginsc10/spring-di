package vacheron.springframework.sfgdi.controllers;

import vacheron.springframework.sfgdi.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
