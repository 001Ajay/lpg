package com.demo.lpgservice.service.impl;

import com.demo.lpgservice.model.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTests {

    @Autowired
    private ProductServiceImpl service;

    @Test
    public void getAllProducts(){
        List<Product> products = service.getAllProducts();
        Assert.assertEquals(34, products.size());
    }
}