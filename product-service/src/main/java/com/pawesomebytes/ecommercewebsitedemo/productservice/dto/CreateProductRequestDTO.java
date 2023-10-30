package com.pawesomebytes.ecommercewebsitedemo.productservice.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class CreateProductRequestDTO {
    private String name;
    private String description;
    private BigDecimal price;
}
