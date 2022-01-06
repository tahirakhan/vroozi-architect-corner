package com.vrooziks.studentservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/student", produces = MediaType.APPLICATION_JSON_VALUE)
public class StudentController {

    @Value("${message:}")
    String message;

    @GetMapping("")
    public String helloWorld(){
        return "Hello World " + message;
    }

    @PostMapping("")
    public String saveWorld(){
        return "Hello World";
    }
}
