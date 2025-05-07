package com.kata.exercise.infrastructure.persistence.mapper;

import com.kata.exercise.domain.model.Order;
import com.kata.exercise.domain.model.OrderItem;
import com.kata.exercise.infrastructure.persistence.entity.OrderEntity;
import com.kata.exercise.infrastructure.persistence.entity.OrderItemEntity;

import java.util.List;
import java.util.stream.Collectors;

public class OrderEntityMapper {
    public static Order toDomain(OrderEntity entity) {
        List<OrderItem> items = entity.getItems().stream()
                .map(OrderEntityMapper::toDomain)
                .collect(Collectors.toList());

        return new Order(
                entity.getId(),
                entity.getCustomerId(),
                entity.getOrderDate(),
                items
        );
    }

    public static OrderItem toDomain(OrderItemEntity entity) {
        return new OrderItem(
                entity.getProductId(),
                entity.getQuantity(),
                entity.getPrice()
        );
    }
}
