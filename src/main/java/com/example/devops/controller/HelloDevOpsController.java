package com.example.devops.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDevOpsController {

    @RequestMapping("/devops")
    public String sayHello() {
        return "Hello DevOps!!";
    }
}
