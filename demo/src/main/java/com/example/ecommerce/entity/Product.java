package com.example.ecommerce.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "products") // database table name
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Product name cannot be empty")
    private String name;

    @NotBlank(message = "Description cannot be empty")
    private String description;

    @Min(value = 0 , message = "Price cannot be negative")
    private double price;

    @Min(value = 0 , message = "Stock cannot be negative ")
    private int stock;

    private String imgUrl;

    public Long getId() {
        return id;
    }

    // Getter and Setter

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "Product name cannot be empty") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "Product name cannot be empty") String name) {
        this.name = name;
    }

    public @NotBlank(message = "Description cannot be empty") String getDescription() {
        return description;
    }

    public void setDescription(@NotBlank(message = "Description cannot be empty") String description) {
        this.description = description;
    }

    @Min(value = 0, message = "Price cannot be negative")
    public double getPrice() {
        return price;
    }

    public void setPrice(@Min(value = 0, message = "Price cannot be negative") double price) {
        this.price = price;
    }

    @Min(value = 0, message = "Stock cannot be negative ")
    public int getStock() {
        return stock;
    }

    public void setStock(@Min(value = 0, message = "Stock cannot be negative ") int stock) {
        this.stock = stock;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }


}
