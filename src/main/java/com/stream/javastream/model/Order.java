package com.stream.javastream.model;

import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDate;

import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "product_order_Table")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {
         @Id
         @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private LocalDate orderDate;
        private LocalDate deliveryDate;
        private OrderStatus status;

        @ManyToOne

        @JoinColumn(name = "customer_fk_id", nullable = false )
      private Customer customer;

        @ManyToMany
        @JoinTable(
                name = "order_product_Tble",
                joinColumns = {@JoinColumn(name = "order_id")},
                inverseJoinColumns = {@JoinColumn(name = "product_id")}
        )
        @ToString.Exclude
    private Set<Product> products;






        }
