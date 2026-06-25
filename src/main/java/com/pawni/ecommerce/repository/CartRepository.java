package com.pawni.ecommerce.repository;

import com.pawni.ecommerce.entity.Cart;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepository
        extends JpaRepository<Cart, Long> {

    List<Cart> findByUserId(
            Long userId
    );
}
