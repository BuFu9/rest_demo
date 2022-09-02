package com.example.rest_demo.controller;

import com.example.rest_demo.model.User;
import com.example.rest_demo.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")


public class UserController {
    UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public String createUser(@RequestBody User user) {
        userService.createUser(user);
        return "done";

    }

}
