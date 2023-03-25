package com.example.sayhello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin("*")
public class sayHelloController {
    @GetMapping("sayhello/{name}")
    public String sayHello(@PathVariable String name){
        return "Hello To The "+name;
    }
}