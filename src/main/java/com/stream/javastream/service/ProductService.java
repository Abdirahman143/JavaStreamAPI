package com.stream.javastream.service;

import com.stream.javastream.model.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductService {
    ResponseEntity<List<Product>> ProductCategory(String category,Double price);
}
