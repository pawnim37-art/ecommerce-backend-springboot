package com.pawni.ecommerce.service;

import com.pawni.ecommerce.entity.Payment;

import com.pawni.ecommerce.repository.PaymentRepository;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final PaymentRepository paymentRepository;

    public PaymentService(
            PaymentRepository paymentRepository
    ) {
        this.paymentRepository =
                paymentRepository;
    }

    public Payment processPayment(
            Payment payment
    ) {

        payment.setPaymentStatus(
                "SUCCESS"
        );

        return paymentRepository
                .save(
                        payment
                );
    }
}