package com.demo.lpgservice.service.impl;

import com.demo.lpgservice.model.Product;
import com.demo.lpgservice.repository.ProductRepository;
import com.demo.lpgservice.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService {

    private ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository){
        this.repository = repository;
    }

    @Override
    public List<Product> getAllProducts() {
        log.debug("getAllProducts...");
        return repository.findAll();
    }
}