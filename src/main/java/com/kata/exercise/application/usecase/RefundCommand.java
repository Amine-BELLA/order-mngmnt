package com.kata.exercise.application.usecase;

public record RefundCommand(
        Long customerId,
        Long orderId,
        Long productId,
        String description,
        String pictureUrl
) {}
