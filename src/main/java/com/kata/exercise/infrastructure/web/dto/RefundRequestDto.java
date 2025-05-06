package com.kata.exercise.infrastructure.web.dto;

public record RefundRequestDto(
        Long orderId,
        Long productId,
        String description,
        String pictureUrl
) {}
