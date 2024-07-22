package com.example.aston_app_homework;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/homework")
public class AppController {

    @GetMapping
    public String hello() {
        return "Hello world ";



    }

}