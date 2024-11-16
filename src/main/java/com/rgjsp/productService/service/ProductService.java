package com.rgjsp.productService.service;

import com.rgjsp.productService.dtos.FakeStoreProductDto;
import com.rgjsp.productService.models.Category;
import com.rgjsp.productService.models.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductService {

   FakeStoreProductService fakeStoreProductService;
    ProductService (FakeStoreProductService fakeStoreProductService) {
        this.fakeStoreProductService = fakeStoreProductService;
    }
    public static Product convertToProduct(FakeStoreProductDto dto) {
        if (dto == null) {
            return null;
        }

        // Creating a new Product instance
        Product product = new Product();
        product.id = dto.id; // Mapping id
        product.productName = dto.title; // Assuming title maps to productName
        product.title = dto.title; // You can adjust based on your requirements

        // Creating and mapping Category
        Category category = new Category();
        category.title = dto.category;
        category.id = generateCategoryId(dto.category); // A method to generate or map category id

        product.category = category;

        return product;
    }

    private static Long generateCategoryId(String categoryTitle) {
        // Here, you could have logic to assign unique IDs based on categoryTitle
        // For now, returning a dummy value
        return 1L; // Replace with actual logic if needed
    }

    public Product getProductById(Long id) {
        return convertToProduct(fakeStoreProductService.getProductById(id));
    }
}
