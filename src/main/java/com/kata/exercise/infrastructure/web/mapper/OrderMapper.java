package com.kata.exercise.infrastructure.web.mapper;

import com.kata.exercise.domain.model.Order;
import com.kata.exercise.domain.model.OrderItem;
import com.kata.exercise.infrastructure.web.dto.OrderDto;
import com.kata.exercise.infrastructure.web.dto.OrderItemDto;

import java.util.stream.Collectors;

public class OrderMapper {
    public static OrderDto toDto(Order order) {
        OrderDto dto = new OrderDto();
        dto.id = order.getId();
        dto.customerId = order.getCustomerId();
        dto.orderDate = order.getOrderDate();
        dto.items = order.getItems().stream()
                .map(OrderMapper::toItemDto)
                .collect(Collectors.toList());
        return dto;
    }

    public static OrderItemDto toItemDto(OrderItem item) {
        OrderItemDto dto = new OrderItemDto();
        dto.productId = item.getProductId();
        dto.quantity = item.getQuantity();
        dto.price = item.getPrice();
        return dto;
    }
}
