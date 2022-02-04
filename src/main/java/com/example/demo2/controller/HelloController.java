package com.example.demo2.controller;

import com.example.demo2.service.FridayCalculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class HelloController {
    @GetMapping("/first-mapping")
    public String firstMapping(){
        return "<b>Hello World<b>";
    }

    @GetMapping("extra-endpoint")
    public String extraendpoint(){
        return "<b>Yet another endpoint<b>";
    }

    @GetMapping("/parameter")
    public String parameter(@RequestParam String input) {
        //For this to work:
        //localhost:8080/parameter?input=HelloWorld
        return input + " " + "end of string";
    }

    @GetMapping("/erdetfredag")
    public String erdetfredag(){
        FridayCalculator fridayCalculator = new FridayCalculator();
        return fridayCalculator.erdetfredag();
    }
}
