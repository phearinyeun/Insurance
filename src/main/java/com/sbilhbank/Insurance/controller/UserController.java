package com.sbilhbank.Insurance.controller;

import com.sbilhbank.Insurance.service.Impl.UserServiceImpl;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

}
