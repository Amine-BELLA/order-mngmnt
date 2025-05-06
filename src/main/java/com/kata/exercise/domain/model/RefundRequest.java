package com.kata.exercise.domain.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class RefundRequest {
    private final UUID id;
    private final Long customerId;
    private final Long orderId;
    private final Long productId;
    private final String description;
    private final String pictureUrl;
    private final LocalDateTime requestedAt;

    public RefundRequest(UUID id, Long customerId, Long orderId, Long productId,
                         String description, String pictureUrl, LocalDateTime requestedAt) {
        this.id = id;
        this.customerId = customerId;
        this.orderId = orderId;
        this.productId = productId;
        this.description = description;
        this.pictureUrl = pictureUrl;
        this.requestedAt = requestedAt;
    }

    public UUID getId() { return id; }
    public Long getCustomerId() { return customerId; }
    public Long getOrderId() { return orderId; }
    public Long getProductId() { return productId; }
    public String getDescription() { return description; }
    public String getPictureUrl() { return pictureUrl; }
    public LocalDateTime getRequestedAt() { return requestedAt; }
}
