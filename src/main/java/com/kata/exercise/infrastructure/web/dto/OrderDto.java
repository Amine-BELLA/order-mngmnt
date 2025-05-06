package com.kata.exercise.infrastructure.web.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class OrderDto {
    public Long id;
    public Long customerId;
    public LocalDateTime orderDate;
    public List<OrderItemDto> items;
}
