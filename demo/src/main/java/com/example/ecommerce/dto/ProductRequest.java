package com.example.ecommerce.dto;

import jakarta.validation.constraints.*;

public class ProductRequest {

    @NotBlank(message = "Product name cannot be empty")
    private String name;

    @NotBlank(message = "Description cannot be empty")
    private String description;

    @Min(value = 0)
    private double price;

    @Min(value = 0)
    private int stock;

    private String imageUrl;

    // getter-setter

    public @NotBlank(message = "Ürün adı boş olamaz") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "Ürün adı boş olamaz") String name) {
        this.name = name;
    }

    public @NotBlank(message = "Açıklama boş olamaz") String getDescription() {
        return description;
    }

    public void setDescription(@NotBlank(message = "Açıklama boş olamaz") String description) {
        this.description = description;
    }

    @Min(value = 0)
    public double getPrice() {
        return price;
    }

    public void setPrice(@Min(value = 0) double price) {
        this.price = price;
    }

    @Min(value = 0)
    public int getStock() {
        return stock;
    }

    public void setStock(@Min(value = 0) int stock) {
        this.stock = stock;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}