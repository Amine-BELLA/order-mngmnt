package com.kata.exercise.infrastructure.web.dto;

import lombok.Data;

@Data
public class OrderItemDto {
    public Long productId;
    public int quantity;
    public double price;
}
