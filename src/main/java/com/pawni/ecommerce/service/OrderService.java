package com.pawni.ecommerce.service;

import com.pawni.ecommerce.entity.OrderEntity;

import com.pawni.ecommerce.repository.OrderRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(
            OrderRepository orderRepository
    ) {
        this.orderRepository =
                orderRepository;
    }

    public OrderEntity placeOrder(
            OrderEntity order
    ) {

        order.setStatus(
                "PLACED"
        );

        return orderRepository
                .save(order);
    }

    public List<OrderEntity> getOrders(
            Long userId
    ) {

        return orderRepository
                .findByUserId(
                        userId
                );
    }

}
