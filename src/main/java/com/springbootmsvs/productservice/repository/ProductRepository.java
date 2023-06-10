package com.springbootmsvs.productservice.repository;

import com.springbootmsvs.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
