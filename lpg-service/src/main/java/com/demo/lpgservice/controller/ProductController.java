package com.demo.lpgservice.controller;

import com.demo.lpgservice.exception.LpgException;
import com.demo.lpgservice.model.Category;
import com.demo.lpgservice.model.Product;
import com.demo.lpgservice.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
@Slf4j
public class ProductController {

    @Autowired private ProductService productService;

    @GetMapping
    public List<Product> getProducts() {
        log.debug("getProducts...");
        try {
            return productService.getAllProducts();
        }catch (LpgException e){
            log.error(e.getErrorMessage());
            return new ArrayList<>();
        }
    }

    @GetMapping("/categories")
    public List<Category> getProductCategories() {
        log.debug("getProductCategories...");
        try {
            return productService.getAllProductCategories();
        }catch (LpgException e){
            log.error(e.getErrorMessage());
            return new ArrayList<>();
        }
    }
}