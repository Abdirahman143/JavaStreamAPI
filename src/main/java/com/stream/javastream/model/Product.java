package com.stream.javastream.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "product_Table")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "product_name")
    private String name;
    @Column(name = "product_price")
    private Double price;

//    @ManyToMany(mappedBy = "products")
//    @ToString.Exclude
//     private Set<Order> orders= new LinkedHashSet<>();
}
