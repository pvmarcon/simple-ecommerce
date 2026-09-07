package com.pvmarcon.dscommerce.dto;

import com.pvmarcon.dscommerce.entities.Product;

public record ProductDTO(Long id, String name, String description, Double price, String imageUrl) {
    public ProductDTO(Product entity) {
        this(entity.getId(), entity.getName(), entity.getDescription(), entity.getPrice(), entity.getImgUrl());
    }
}