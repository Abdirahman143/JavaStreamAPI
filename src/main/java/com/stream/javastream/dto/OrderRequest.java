package com.stream.javastream.dto;

import com.stream.javastream.model.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderRequest {

    private Long id;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private OrderStatus status;
}
