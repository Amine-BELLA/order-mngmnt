package com.kata.exercise.infrastructure.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "refund_requests")
@Data
public class RefundRequestEntity {
    @Id
    private UUID id;

    private Long customerId;
    private Long orderId;
    private Long productId;

    private String description;
    private String pictureUrl;
    private LocalDateTime requestedAt;
}
