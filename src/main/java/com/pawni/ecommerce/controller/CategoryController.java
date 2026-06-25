package com.pawni.ecommerce.controller;

import com.pawni.ecommerce.entity.Category;
import com.pawni.ecommerce.service.CategoryService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(
            CategoryService categoryService
    ) {
        this.categoryService =
                categoryService;
    }

    // GET ALL CATEGORIES
    @GetMapping
    public List<Category>
    getAllCategories() {

        return categoryService
                .getAllCategories();
    }

    // ADD CATEGORY
    @PostMapping
    public Category addCategory(
            @RequestBody Category category
    ) {

        return categoryService
                .addCategory(category);
    }
}