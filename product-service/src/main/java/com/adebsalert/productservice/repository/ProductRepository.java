package com.adebsalert.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.adebsalert.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
    
}