package com.rgjsp.productService.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDto {
    public Long id;
    public String title;
    public String price;
    public  String description;
    public String category;
    public String image;

}
