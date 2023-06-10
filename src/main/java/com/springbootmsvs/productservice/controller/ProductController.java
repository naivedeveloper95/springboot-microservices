package com.springbootmsvs.productservice.controller;

import com.springbootmsvs.productservice.dto.ProductRequest;
import com.springbootmsvs.productservice.dto.ProductResponse;
import com.springbootmsvs.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest) {
        productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(value = HttpStatus.OK)
    public List<ProductResponse> getAllProducts() {
        return productService.getProducts();
    }
}
