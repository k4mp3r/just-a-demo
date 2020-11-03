package dev.kampling.justademo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String getHelloWorld(@RequestParam(value = "greeting", defaultValue = "World") String greeting){
        return "Hello " + greeting;
    }
}
