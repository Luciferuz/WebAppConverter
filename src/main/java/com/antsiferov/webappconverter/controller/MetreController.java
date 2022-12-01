package com.antsiferov.webappconverter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MetreController {

    @GetMapping("/metre")
    public String metre() {
        return "metre";
    }
}
