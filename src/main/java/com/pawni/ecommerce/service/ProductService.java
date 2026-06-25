package com.pawni.ecommerce.service;

import com.pawni.ecommerce.entity.Product;
import com.pawni.ecommerce.repository.ProductRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(
            ProductRepository productRepository
    ) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> searchProducts(
            String name
    ) {
        return productRepository
                .findByNameContainingIgnoreCase(name);
    }

    public Page<Product> getProductsPage(
            int page,
            int size
    ) {
        return productRepository.findAll(
                PageRequest.of(page, size)
        );
    }

    public List<Product> sortProducts(
            String field
    ) {
        return productRepository.findAll(
                Sort.by(field)
        );
    }

    public Product addProduct(
            Product product
    ) {
        return productRepository.save(product);
    }

    public Product getProductById(
            Long id
    ) {
        return productRepository
                .findById(id)
                .orElse(null);
    }

    public Product updateProduct(
            Long id,
            Product product
    ) {

        Product existing =
                productRepository
                        .findById(id)
                        .orElse(null);

        if (existing != null) {

            existing.setName(
                    product.getName()
            );

            existing.setDescription(
                    product.getDescription()
            );

            existing.setPrice(
                    product.getPrice()
            );

            existing.setStock(
                    product.getStock()
            );

            return productRepository
                    .save(existing);
        }

        return null;
    }

    public void deleteProduct(
            Long id
    ) {
        productRepository.deleteById(id);
    }
}