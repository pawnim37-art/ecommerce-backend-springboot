package com.pawni.ecommerce.repository;

import com.pawni.ecommerce.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository
        extends JpaRepository<User,Long> {

    Optional<User>
    findByEmail(
            String email
    );
}