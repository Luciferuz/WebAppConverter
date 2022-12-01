package com.antsiferov.webappconverter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

@Controller
public class Measure {

    @GetMapping("/measure")
    public String measure() {
        return "distance";
    }

    @PostMapping("/measure")
    public String measureanswer(Model model, @RequestParam String firstdate, @RequestParam String seconddate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate startDate = LocalDate.parse(firstdate, formatter);
        LocalDate endDate = LocalDate.parse(seconddate, formatter);
        Period period = Period.between(startDate, endDate);
        model.addAttribute("days", period.getDays());
        model.addAttribute("months", period.getMonths());
        model.addAttribute("years", period.getYears());
        return "distance";
    }
}
