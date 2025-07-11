package com.example.ecommerce.exception;

public class ProductNotFoundException extends RuntimeException {

  public ProductNotFoundException(Long id) {
    super("Product is not found");
  }
}
