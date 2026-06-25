package com.pawni.ecommerce.service;

import com.pawni.ecommerce.DTO.LoginRequest;
import com.pawni.ecommerce.entity.User;
import com.pawni.ecommerce.repository.UserRepository;
import com.pawni.ecommerce.Security.JwtUtil;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(
            UserRepository userRepository
    ) {
        this.userRepository =
                userRepository;
    }

    // REGISTER
    public User register(
            User user
    ) {

        user.setRole(
                "USER"
        );

        return userRepository
                .save(
                        user
                );
    }

    // LOGIN + JWT
    public String login(
            LoginRequest request
    ) {

        Optional<User> user =
                userRepository
                        .findByEmail(
                                request.getEmail()
                        );

        if (
                user.isPresent()
                        &&
                        user.get()
                                .getPassword()
                                .equals(
                                        request.getPassword()
                                )
        ) {

            return JwtUtil
                    .generateToken(
                            request.getEmail()
                    );
        }

        return "INVALID EMAIL OR PASSWORD";
    }

}
