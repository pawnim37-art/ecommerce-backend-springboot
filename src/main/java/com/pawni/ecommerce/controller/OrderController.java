package com.pawni.ecommerce.controller;

import com.pawni.ecommerce.entity.OrderEntity;

import com.pawni.ecommerce.service.OrderService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/orders")

public class OrderController {

    private final OrderService orderService;

    public OrderController(
            OrderService orderService
    ) {
        this.orderService =
                orderService;
    }

    // PLACE ORDER

    @PostMapping

    public OrderEntity placeOrder(
            @RequestBody
            OrderEntity order
    ) {

        return orderService
                .placeOrder(
                        order
                );
    }

    // GET USER ORDERS

    @GetMapping("/{userId}")

    public List<OrderEntity> getOrders(
            @PathVariable
            Long userId
    ) {

        return orderService
                .getOrders(
                        userId
                );
    }
}