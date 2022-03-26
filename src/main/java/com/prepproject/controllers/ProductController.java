package com.prepproject.controllers;

import com.prepproject.entities.Category;
import com.prepproject.entities.Product;
import com.prepproject.repositories.ProductCategoryRepository;
import com.prepproject.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    private final ProductRepository productRepository;
    private final ProductCategoryRepository productCategoryRepository;

    @Autowired
    public ProductController(ProductRepository productRepository, ProductCategoryRepository productCategoryRepository) {
        this.productRepository = productRepository;
        this.productCategoryRepository = productCategoryRepository;
    }


    //REST endpoint
    @GetMapping
    public List<Product> getProducts() {
        List<Product> products = productRepository.findAll();
        return products;
    }

    @GetMapping(value = "/categories")
    public List<Category> getProductCategories() {
        return productCategoryRepository.findAll();
    }
}
