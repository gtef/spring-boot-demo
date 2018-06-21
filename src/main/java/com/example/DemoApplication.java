package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;


@Controller
@EnableAutoConfiguration
public class DemoApplication {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World with Codeship!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(DemoApplication.class, args);
    }
}