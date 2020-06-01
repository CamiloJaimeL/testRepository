package com.jdc.test.testproject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestProjectController {
    @GetMapping("/test")
    public String test(){
        return "Hello World";
    }
}
