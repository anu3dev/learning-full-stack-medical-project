package com.anu3dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anu3dev.model.UserLogin;
import com.anu3dev.service.UserLoginService;

@RestController
public class UsersLoginController {

    @Autowired
    private UserLoginService service;

    @PostMapping("/register")
    public UserLogin register(@RequestBody UserLogin user) {
        return service.register(user);
    }
    
    @PostMapping("/login")
    public String login(@RequestBody UserLogin user) {
        return service.verify(user);
    }
}