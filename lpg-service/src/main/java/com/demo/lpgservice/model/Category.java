package com.demo.lpgservice.model;

import lombok.Builder;
import lombok.Data;
import lombok.Value;

@Data
@Builder
public class Category {
    int id;
    String name;
}
