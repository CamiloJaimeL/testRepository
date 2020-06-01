package com.jdc.test.testproject.controllers;

import com.jdc.test.testproject.dto.TestDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestProjectController {
    @GetMapping("/test")
    public String test(){
        return TestDto.builder().greeting("Wabba laba dub dub").build().getGreeting();
        
    }
}
