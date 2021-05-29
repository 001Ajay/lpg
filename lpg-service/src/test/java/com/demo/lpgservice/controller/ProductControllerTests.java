package com.demo.lpgservice.controller;

import com.demo.lpgservice.service.ProductService;
import com.demo.lpgservice.utils.TestHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(ProductController.class)
public class ProductControllerTests {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private ProductService service;

    @Test
    public void getAllProductsTest() throws Exception {
        Mockito.when(service.getAllProducts()).thenReturn(TestHelper.productSupplier.get());
        mvc.perform(MockMvcRequestBuilders
                .get("/products/")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}