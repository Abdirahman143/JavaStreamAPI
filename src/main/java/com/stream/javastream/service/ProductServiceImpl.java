package com.stream.javastream.service;

import com.stream.javastream.model.Product;
import com.stream.javastream.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {
    private  final ProductRepository productRepository;
            @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public ResponseEntity<List<Product>>ProductCategory(String category,Double price){
        List<Product>products = productRepository.findAll();
                products.
                        stream().
                        filter(p-> p.getCategory().equalsIgnoreCase(category)).
                        filter(p-> p.getPrice()>price).
                        collect(Collectors.toList());

                return new ResponseEntity<>(products, HttpStatus.OK);

    }
}
