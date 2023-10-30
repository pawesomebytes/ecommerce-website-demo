package com.pawesomebytes.ecommercewebsitedemo.productservice.service.impl;

import com.pawesomebytes.ecommercewebsitedemo.productservice.dto.CreateProductRequestDTO;
import com.pawesomebytes.ecommercewebsitedemo.productservice.model.Product;
import com.pawesomebytes.ecommercewebsitedemo.productservice.repository.ProductRepository;
import com.pawesomebytes.ecommercewebsitedemo.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public Product createProduct(final CreateProductRequestDTO productDTO) {
        final Product product = Product.builder()
                .id(UUID.randomUUID())
                .name(productDTO.getName())
                .description(productDTO.getDescription())
                .price(productDTO.getPrice())
                .build();
        return productRepository.save(product);
    }

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }
}
