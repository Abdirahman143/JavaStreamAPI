package com.stream.javastream.controller;

import com.stream.javastream.model.Product;
import com.stream.javastream.service.ProductService;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/api")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/category/price")
    public ResponseEntity<List<Product>> getAllProductCategory(@Param("category")
                                                              String category,
                                                               @Param("price")
                                                              Double price ){
           return productService.ProductCategory(category,price);
    }
}
