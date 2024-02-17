package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class name {
    @GetMapping("/")
    public String sega() {
        return "Home Page";
    }

    @GetMapping("/contact")
    public String contact() {
        return "9676646400";
    }

    @GetMapping("/contact/a/b/c/sujji")
    public String contacta() {
        return "springboot";
    }

}