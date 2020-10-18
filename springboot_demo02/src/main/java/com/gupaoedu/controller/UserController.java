package com.gupaoedu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Value("${user.username}")
    private String username;

    @Value("${user.age}")
    private Integer age;

    @Value("${user.address}")
    private String address;

    @GetMapping("/hello")
    public String hello(){
        return "Hello SpringBoot.."+username+"--"+age+"--"+address;
    }

}
