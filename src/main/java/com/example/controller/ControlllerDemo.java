package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlllerDemo {

    @RequestMapping("/print")
    public String print() {
        return "hello springBoot!";
    }
}
