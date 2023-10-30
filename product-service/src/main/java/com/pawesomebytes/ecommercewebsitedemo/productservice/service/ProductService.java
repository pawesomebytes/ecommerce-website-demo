package com.pawesomebytes.ecommercewebsitedemo.productservice.service;

import com.pawesomebytes.ecommercewebsitedemo.productservice.dto.CreateProductRequestDTO;
import com.pawesomebytes.ecommercewebsitedemo.productservice.model.Product;

import java.util.List;

public interface ProductService {
    Product createProduct(CreateProductRequestDTO productDTO);

    List<Product> getProducts();
}
