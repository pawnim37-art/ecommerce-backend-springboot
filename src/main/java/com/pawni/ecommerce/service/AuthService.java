package com.pawni.ecommerce.service;

import com.pawni.ecommerce.entity.User;
import com.pawni.ecommerce.repository.UserRepository;
import com.pawni.ecommerce.Security.JwtUtil;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UserRepository userRepository;

    public AuthService(
            UserRepository userRepository
    ) {
        this.userRepository =
                userRepository;
    }

    public String login(
            String email,
            String password
    ) {

        User user =
                userRepository
                        .findByEmail(email)
                        .orElse(null);

        if (
                user != null &&
                        user.getPassword()
                                .equals(password)
        ) {

            return JwtUtil
                    .generateToken(
                            email
                    );
        }

        return "INVALID EMAIL OR PASSWORD";
    }
}