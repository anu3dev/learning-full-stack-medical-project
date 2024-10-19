package com.anu3dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anu3dev.model.UserLogin;
import com.anu3dev.service.UserLoginService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/user/v1/")
public class UsersLoginController {

    @Autowired
    private UserLoginService service;

    @PostMapping("/register")
    public String register(@RequestBody UserLogin user) {
        return service.register(user);
    }
    
    @PostMapping("/login")
    public String login(@RequestBody UserLogin user) {
        return service.verify(user);
    }
}