package com.pawni.ecommerce.controller;

import com.pawni.ecommerce.entity.Cart;

import com.pawni.ecommerce.service.CartService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/cart")

public class CartController {

    private final CartService cartService;

    public CartController(
            CartService cartService
    ) {
        this.cartService =
                cartService;
    }

    // ADD ITEM

    @PostMapping

    public Cart addToCart(
            @RequestBody
            Cart cart
    ) {

        return cartService
                .addToCart(
                        cart
                );
    }

    // GET USER CART

    @GetMapping("/{userId}")

    public List<Cart> getCart(
            @PathVariable
            Long userId
    ) {

        return cartService
                .getUserCart(
                        userId
                );
    }

    // DELETE ITEM

    @DeleteMapping("/{id}")

    public void removeItem(
            @PathVariable
            Long id
    ) {

        cartService
                .removeCartItem(
                        id
                );
    }

}