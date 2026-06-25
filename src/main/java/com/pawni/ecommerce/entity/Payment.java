package com.pawni.ecommerce.entity;

import jakarta.persistence.*;

@Entity
public class Payment {

    @Id

    @GeneratedValue(
            strategy =
                    GenerationType.IDENTITY
    )

    private Long id;

    private Long orderId;

    private Double amount;

    private String paymentStatus;

    public Long getId() {
        return id;
    }

    public void setId(
            Long id
    ) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(
            Long orderId
    ) {
        this.orderId = orderId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(
            Double amount
    ) {
        this.amount = amount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(
            String paymentStatus
    ) {
        this.paymentStatus = paymentStatus;
    }
}