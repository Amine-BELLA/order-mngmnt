package com.kata.exercise.domain.model;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private final Long id;
    private final Long customerId;
    private final LocalDateTime orderDate;
    private final List<OrderItem> items;

    public Order(Long id, Long customerId, LocalDateTime orderDate, List<OrderItem> items) {
        this.id = id;
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.items = items;
    }

    public Long getId() { return id; }
    public Long getCustomerId() { return customerId; }
    public LocalDateTime getOrderDate() { return orderDate; }
    public List<OrderItem> getItems() { return items; }
}
