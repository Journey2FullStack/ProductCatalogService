package com.rgjsp.productService.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    public Long id;
    public String productName;
    public String title;
    public Category category;
}
