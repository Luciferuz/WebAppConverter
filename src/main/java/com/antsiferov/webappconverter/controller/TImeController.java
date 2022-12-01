package com.antsiferov.webappconverter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TImeController {

    @GetMapping("/time")
    public String time() {
        return "time";
    }
}
