package com.pawesomebytes.ecommercewebsitedemo.productservice.repository;

import com.pawesomebytes.ecommercewebsitedemo.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface ProductRepository extends MongoRepository<Product, UUID> {
}
