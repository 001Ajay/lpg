package com.demo.lpgservice.service.impl;

import com.demo.lpgservice.exception.LpgException;
import com.demo.lpgservice.model.Category;
import com.demo.lpgservice.model.Product;
import com.demo.lpgservice.repository.CategoryRepository;
import com.demo.lpgservice.repository.ProductRepository;
import com.demo.lpgservice.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService {

    private ProductRepository repository;
    private CategoryRepository categoryRepository;

    public ProductServiceImpl(ProductRepository repository, CategoryRepository categoryRepository){
        this.repository = repository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Product> getAllProducts() throws LpgException {
        log.debug("getAllProducts...");
        try{
            return repository.findAll();
        }catch (Exception e){
            log.error(e.getMessage());
            throw new LpgException("Failed to get all Products.", e);
        }
    }

    @Override
    public List<Category> getAllProductCategories() throws LpgException {
        log.debug("getAllProductCategories...");
        try{
            return categoryRepository.findAll();
        }catch (Exception e){
            log.error(e.getMessage());
            throw new LpgException("Failed to get all Product Categories.", e);
        }
    }
}