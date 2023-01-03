package com.example.sayhello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sayHelloController {
    @GetMapping("sayhello")
    public String sayHello(){
        return "say hello 59";
    }
}