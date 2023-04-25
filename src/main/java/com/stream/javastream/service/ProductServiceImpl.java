package com.stream.javastream.service;

import com.stream.javastream.dto.OrderRequest;
import com.stream.javastream.dto.ProductRequest;
import com.stream.javastream.model.Order;
import com.stream.javastream.model.Product;
import com.stream.javastream.repository.ProductRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {
    private  final ProductRepository productRepository;
            @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }



    public ResponseEntity<Product>CreatProduct(ProductRequest productRequest){
                Product product = new Product();
                product.setName(productRequest.getName());
                product.setCategory(productRequest.getCategory());
                product.setPrice(productRequest.getPrice());
//                product.setOrders(
//                        productRequest.
//                                getOrders().
//                                stream().
//                                map(this::OrderMapToProduct).
//                                collect(Collectors.
//                                        toUnmodifiableSet()));
                return new ResponseEntity<>(productRepository.save(product),HttpStatus.CREATED);
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

    public Set<OrderRequest> OrderMapToProduct(Order order){
              Set<OrderRequest>orderRequests = new HashSet<>();
              orderRequests.add( OrderRequest.
                      builder().
                      id(order.getId()).
                      orderDate(order.getOrderDate()).
                      deliveryDate(order.getDeliveryDate()).
                      status(order.getStatus()).
                      build());
                     return orderRequests;

    }


}
