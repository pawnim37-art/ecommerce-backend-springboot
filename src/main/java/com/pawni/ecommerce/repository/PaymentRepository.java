package com.pawni.ecommerce.repository;

import com.pawni.ecommerce.entity.Payment;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository
        extends JpaRepository<Payment, Long> {

}