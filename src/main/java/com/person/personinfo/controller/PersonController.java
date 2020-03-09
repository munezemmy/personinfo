package com.person.personinfo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/person-greet")
    public String greetings(){
        return "hello Kubernetees";
    }
}
