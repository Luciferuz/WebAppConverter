package com.antsiferov.webappconverter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerHelloWorld {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
