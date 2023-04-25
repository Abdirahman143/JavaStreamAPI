package com.stream.javastream.dto;

import com.stream.javastream.model.Order;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductRequest {

    private Long id;
    private String name;
    private String category;

    private Double price;
    private Set<Order> orders;
}
