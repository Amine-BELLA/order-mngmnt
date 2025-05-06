package com.kata.exercise.infrastructure.web.controller;

import com.kata.exercise.application.usecase.RefundCommand;
import com.kata.exercise.application.usecase.SubmitRefundRequestUseCase;
import com.kata.exercise.infrastructure.web.dto.RefundRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers/{customerId}/refunds")
public class RefundController {

    private final SubmitRefundRequestUseCase useCase;

    public RefundController(SubmitRefundRequestUseCase useCase) {
        this.useCase = useCase;
    }

    /**
     * Submits a refund request for a specific product in an order.
     *
     * @param customerId the ID of the customer submitting the refund request
     * @param dto the {@link RefundRequestDto} containing refund details including order ID, product ID,
     *            issue description, and picture URL as evidence
     */
    @PostMapping
    public void requestRefund(@PathVariable Long customerId, @RequestBody RefundRequestDto dto) {
        RefundCommand command = new RefundCommand(
                customerId,
                dto.orderId(),
                dto.productId(),
                dto.description(),
                dto.pictureUrl()
        );
        useCase.execute(command);
    }
}