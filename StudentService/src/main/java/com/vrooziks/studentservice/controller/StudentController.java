package com.vrooziks.studentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Value("${stu-pops.message:}")
    String message;

    @Autowired
    Environment environment;

    @GetMapping("/student")
    public String helloWorld(){
        return "Hello World " + message + " port = "+environment.getProperty("local.server.port");
    }

    @PostMapping("")
    public String saveWorld(){
        return "Hello World";
    }
}
