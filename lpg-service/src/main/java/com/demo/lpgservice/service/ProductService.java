package com.demo.lpgservice.service;

import com.demo.lpgservice.exception.LpgException;
import com.demo.lpgservice.model.Category;
import com.demo.lpgservice.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts() throws LpgException;

    List<Category> getAllProductCategories() throws LpgException;
}