package com.pawni.ecommerce.controller;
import com.pawni.ecommerce.entity.Product;
import com.pawni.ecommerce.service.ProductService;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(
            ProductService productService
    ) {
        this.productService = productService;
    }

    // GET ALL PRODUCTS
    @GetMapping
    public List<Product> getAllProducts() {

        return productService.getAllProducts();
    }

    // SEARCH
    @GetMapping("/search")
    public List<Product> searchProducts(

            @RequestParam
            String name

    ) {

        return productService.searchProducts(
                name
        );
    }

    // SORT
    @GetMapping("/sort")
    public List<Product> sortProducts(

            @RequestParam
            String field

    ) {

        return productService.sortProducts(
                field
        );
    }

    // PAGINATION
    @GetMapping("/page")
    public Page<Product> getProductsPage(

            @RequestParam int page,

            @RequestParam int size

    ) {

        return productService.getProductsPage(
                page,
                size
        );
    }

    // ADD PRODUCT
    @PostMapping
    public Product addProduct(

            @RequestBody
            Product product

    ) {

        return productService.addProduct(
                product
        );
    }

    // GET PRODUCT BY ID
    @GetMapping("/{id}")
    public Product getProductById(

            @PathVariable
            Long id

    ) {

        return productService.getProductById(
                id
        );
    }

    // UPDATE PRODUCT
    @PutMapping("/{id}")
    public Product updateProduct(

            @PathVariable
            Long id,

            @RequestBody
            Product product

    ) {

        return productService.updateProduct(
                id,
                product
        );
    }

    // DELETE PRODUCT
    @DeleteMapping("/{id}")
    public void deleteProduct(

            @PathVariable
            Long id

    ) {

        productService.deleteProduct(
                id
        );
    }
}