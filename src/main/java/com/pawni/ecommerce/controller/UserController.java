package com.pawni.ecommerce.controller;

import com.pawni.ecommerce.DTO.LoginRequest;
import com.pawni.ecommerce.entity.User;
import com.pawni.ecommerce.service.UserService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class UserController {

    private final UserService userService;

    public UserController(
            UserService userService
    ) {
        this.userService =
                userService;
    }

    // REGISTER
    @PostMapping(
            "/register"
    )
    public User register(

            @RequestBody
            User user

    ) {

        return userService
                .register(
                        user
                );
    }

    // LOGIN
    @PostMapping(
            "/login"
    )
    public String login(

            @RequestBody
            LoginRequest request

    ) {

        return userService
                .login(
                        request
                );
    }
}