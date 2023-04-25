package com.stream.javastream.repository;

import com.stream.javastream.model.Customer;
import com.stream.javastream.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
