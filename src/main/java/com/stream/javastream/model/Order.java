package com.stream.javastream.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

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

        }
