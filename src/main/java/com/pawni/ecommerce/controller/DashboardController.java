package com.pawni.ecommerce.controller;

import com.pawni.ecommerce.repository.ProductRepository;

import com.pawni.ecommerce.repository.UserRepository;

import com.pawni.ecommerce.repository.OrderRepository;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

import java.util.Map;

@RestController

@RequestMapping("/dashboard")

public class DashboardController {

    private final ProductRepository productRepository;

    private final UserRepository userRepository;

    private final OrderRepository orderRepository;

    public DashboardController(

            ProductRepository productRepository,

            UserRepository userRepository,

            OrderRepository orderRepository

    ) {

        this.productRepository =
                productRepository;

        this.userRepository =
                userRepository;

        this.orderRepository =
                orderRepository;
    }

    @GetMapping

    public Map<String, Long> stats() {

        Map<String, Long> data =
                new HashMap<>();

        data.put(
                "products",
                productRepository.count()
        );

        data.put(
                "users",
                userRepository.count()
        );

        data.put(
                "orders",
                orderRepository.count()
        );

        return data;
    }
}