package com.pawni.ecommerce.controller;

import com.pawni.ecommerce.entity.Payment;

import com.pawni.ecommerce.service.PaymentService;

import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/payments")

public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(
            PaymentService paymentService
    ) {
        this.paymentService =
                paymentService;
    }

    @PostMapping

    public Payment pay(

            @RequestBody

            Payment payment
    ) {

        return paymentService
                .processPayment(
                        payment
                );
    }

}