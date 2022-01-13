package com.vrooziks.university.controller;

import com.vrooziks.university.model.University;
import com.vrooziks.university.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableFeignClients(basePackages = "com.vrooziks.university.client")
public class UniversityController {

    @Autowired
    UniversityService service;

    @GetMapping(value = "/university")
    public University helloWorld(){

        return service.getUniversityMessage();
    }
}
