package com.antsiferov.webappconverter;

import com.antsiferov.webappconverter.controller.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class WebAppConverterApplicationTests {

    @Test
    void aboutLoads() {
        AboutController aboutController = new AboutController();
        String result = aboutController.about();
        assertEquals("aboutme", result);
    }

    @Test
    void helloWorldLoads() {
        ControllerHelloWorld controllerHelloWorld = new ControllerHelloWorld();
        String result = controllerHelloWorld.index();
        assertEquals("Greetings from Spring Boot!", result);
    }

    @Test
    void homeLoads() {
        HomeController homeController = new HomeController();
        String result = homeController.home();
        assertEquals("home", result);
    }

    @Test
    void languageLoads() {
        LanguageController languageController = new LanguageController();
        String result = languageController.changeLanguage(new Locale("en-EN"));
        assertEquals("redirect:/home/?lang=en_EN", result);
    }

    @Test
    void measureLoads() {
        Measure measure = new Measure();
        String result = measure.measure();
        assertEquals("distance", result);
    }

    @Test
    void metreLoads() {
        MetreController metreController = new MetreController();
        String result = metreController.metre();
        assertEquals("metre", result);
    }

    @Test
    void timeLoads() {
        TImeController timeController = new TImeController();
        String result = timeController.time();
        assertEquals("time", result);
    }

}