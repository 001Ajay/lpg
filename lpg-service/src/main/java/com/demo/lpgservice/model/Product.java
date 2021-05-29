package com.demo.lpgservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="products")
public class Product {
    @Id
    private Long id;
    private String name;
    private String description;
    private Long category_id;
    private String creation_date;
    private String update_date;
    private String last_purchased;
}
