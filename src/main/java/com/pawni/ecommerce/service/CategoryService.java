package com.pawni.ecommerce.service;

import com.pawni.ecommerce.entity.Category;
import com.pawni.ecommerce.repository.CategoryRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(
            CategoryRepository categoryRepository
    ) {
        this.categoryRepository =
                categoryRepository;
    }

    // GET ALL
    public List<Category>
    getAllCategories() {

        return categoryRepository
                .findAll();
    }

    // ADD
    public Category addCategory(
            Category category
    ) {

        return categoryRepository
                .save(category);
    }

}