package com.rgjsp.productService.controllers;

import com.rgjsp.productService.models.Product;
import com.rgjsp.productService.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

}
