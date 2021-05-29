package com.demo.lpgservice.repository;

import com.demo.lpgservice.model.Category;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryRepositoryTests {

    @Autowired
    private CategoryRepository repository;

    @Test
    public void getAllCategoriesTest(){
        List<Category> categories = repository.findAll();
        Assert.assertEquals(7, categories.size());
    }
}
