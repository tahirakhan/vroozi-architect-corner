package com.vrooziks.gatewayjavaconfighystrix.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallBackContoller {

    @GetMapping("/studentFallBack")
    public String studentFallBack() {
        return "Student Fallback Service";
    }

    @GetMapping("/uniFallBack")
    public String uniFallBack() {
        return "University Fallback Service";
    }

}