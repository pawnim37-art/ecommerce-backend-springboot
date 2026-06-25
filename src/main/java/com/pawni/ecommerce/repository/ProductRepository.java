package com.pawni.ecommerce.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.pawni.ecommerce.entity.Product;


import com.pawni.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository
        extends JpaRepository<Product, Long> {

    List<Product> findByNameContainingIgnoreCase(
            String name
    );

}