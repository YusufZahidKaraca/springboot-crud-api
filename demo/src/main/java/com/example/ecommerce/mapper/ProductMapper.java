package com.example.ecommerce.mapper;

import com.example.ecommerce.dto.*;
import com.example.ecommerce.entity.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public static Product toEntity(ProductRequest dto) {
        Product p = new Product();
        p.setName(dto.getName());
        p.setDescription(dto.getDescription());
        p.setPrice(dto.getPrice());
        p.setStock(dto.getStock());
        p.setImgUrl(dto.getImageUrl());
        return p;
    }

    public static ProductResponse toResponse(Product entity) {
        ProductResponse res = new ProductResponse();
        res.setId(entity.getId());
        res.setName(entity.getName());
        res.setDescription(entity.getDescription());
        res.setPrice(entity.getPrice());
        res.setStock(entity.getStock());
        res.setImageUrl(entity.getImgUrl());
        return res;
    }
}
