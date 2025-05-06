package com.kata.exercise.domain.model;

public class OrderItem {
    private final Long productId;
    private final int quantity;
    private final double price;

    public OrderItem(Long productId, int quantity, double price) {
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    public Long getProductId() { return productId; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }
}
