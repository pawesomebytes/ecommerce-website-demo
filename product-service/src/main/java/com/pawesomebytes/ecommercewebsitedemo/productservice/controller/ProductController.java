package com.pawesomebytes.ecommercewebsitedemo.productservice.controller;

import com.pawesomebytes.ecommercewebsitedemo.productservice.dto.CreateProductRequestDTO;
import com.pawesomebytes.ecommercewebsitedemo.productservice.model.Product;
import com.pawesomebytes.ecommercewebsitedemo.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.pawesomebytes.ecommercewebsitedemo.productservice.controller.ControllerConstants.API_PATH;
import static com.pawesomebytes.ecommercewebsitedemo.productservice.controller.ControllerConstants.V1_PATH;

@RestController
@RequestMapping(API_PATH + V1_PATH + "/products")
@RequiredArgsConstructor
public class ProductController {
    final ProductService productService;
    @GetMapping
    public ResponseEntity<?> gerProducts() {
        final List<Product> products = productService.getProducts();
        return ResponseEntity.ok(products);
    }

    @PostMapping
    public ResponseEntity<?> createProduct(@RequestBody final CreateProductRequestDTO productDto) {
        final Product product = productService.createProduct(productDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(product);
    }
}
