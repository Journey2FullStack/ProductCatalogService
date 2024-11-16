package com.rgjsp.productService.service;

import com.rgjsp.productService.dtos.FakeStoreProductDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/products")
public class FakeStoreProductService {
    RestTemplate restTemplate; // httpClient

    FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public FakeStoreProductDto getProductById(Long id) {
        return restTemplate.getForObject("https://fakestoreapi.com/products/" + id, FakeStoreProductDto.class);
    }

}
