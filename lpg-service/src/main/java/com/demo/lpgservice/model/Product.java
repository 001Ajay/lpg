package com.demo.lpgservice.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {
    int id;
    String name;
    String description;
    int category_id;
    String creation_date;
    String update_date;
    String last_purchased;
}
