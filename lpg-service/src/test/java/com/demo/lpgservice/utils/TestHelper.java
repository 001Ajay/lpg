package com.demo.lpgservice.utils;

import com.demo.lpgservice.model.Category;
import com.demo.lpgservice.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class TestHelper {
    
    public static Supplier<List<Product>> productSupplier = () -> { 
        List<Product> list = new ArrayList<>();
        list.add(new Product(Long.valueOf(1),"Knife Set", "A set of knives in all shapes and sizes.", new Category(Long.valueOf(1), "Kitchen"), "2020-09-20 0:01", "2020-09-20 0:01", "2020-10-24 0:01"));
        return list;  
    };

    public static Supplier<List<Category>> categorySupplier = () -> {
        List<Category> list = new ArrayList<>();
        list.add(new Category(Long.valueOf(1),"Kitchen"));
        return list;
    };
}