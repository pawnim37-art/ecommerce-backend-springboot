package com.pawni.ecommerce.service;

import com.pawni.ecommerce.entity.Cart;

import com.pawni.ecommerce.repository.CartRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    private final CartRepository cartRepository;

    public CartService(
            CartRepository cartRepository
    ) {
        this.cartRepository =
                cartRepository;
    }

    // ADD TO CART
    public Cart addToCart(
            Cart cart
    ) {

        return cartRepository
                .save(cart);
    }

    // GET USER CART
    public List<Cart> getUserCart(
            Long userId
    ) {

        return cartRepository
                .findByUserId(
                        userId
                );
    }

    // REMOVE ITEM
    public void removeCartItem(
            Long id
    ) {

        cartRepository
                .deleteById(id);
    }

}