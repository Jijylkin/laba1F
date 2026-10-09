package com.example.laba1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello,world";
    }

    @GetMapping("/marks")
    public int marks() {
        return 24086;
    }
}
