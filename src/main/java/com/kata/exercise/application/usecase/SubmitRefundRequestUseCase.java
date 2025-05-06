package com.kata.exercise.application.usecase;

import com.kata.exercise.domain.model.RefundRequest;
import com.kata.exercise.domain.repository.RefundRequestRepository;

import java.time.LocalDateTime;
import java.util.UUID;

public class SubmitRefundRequestUseCase {
    private final RefundRequestRepository repository;

    public SubmitRefundRequestUseCase(RefundRequestRepository repository) {
        this.repository = repository;
    }

    public RefundRequest execute(RefundCommand command) {
        RefundRequest request = new RefundRequest(
                UUID.randomUUID(),
                command.customerId(),
                command.orderId(),
                command.productId(),
                command.description(),
                command.pictureUrl(),
                LocalDateTime.now()
        );
        return repository.save(request);
    }
}
