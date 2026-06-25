package com.pawni.ecommerce.DTO;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class ProductDTO {

    @NotBlank(
            message =
                    "Name cannot be empty"
    )
    private String name;

    private String description;

    @Min(
            value = 1,
            message =
                    "Price must be greater than 0"
    )
    private Double price;

    @Min(
            value = 0,
            message =
                    "Stock cannot be negative"
    )
    private Integer stock;

    public ProductDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(
            String name
    ) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(
            String description
    ) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(
            Double price
    ) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(
            Integer stock
    ) {
        this.stock = stock;
    }
}