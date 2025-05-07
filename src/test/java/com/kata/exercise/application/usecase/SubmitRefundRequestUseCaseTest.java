package com.kata.exercise.application.usecase;

import com.kata.exercise.domain.model.RefundRequest;
import com.kata.exercise.domain.repository.RefundRequestRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class SubmitRefundRequestUseCaseTest {
    private RefundRequestRepository repository;
    private SubmitRefundRequestUseCase useCase;

    @BeforeEach
    void setUp() {
        repository = mock(RefundRequestRepository.class);
        useCase = new SubmitRefundRequestUseCase(repository);
    }

    @Test
    void shouldSaveRefundRequest() {
        RefundCommand command = new RefundCommand(
                1L,
                100L,
                200L,
                "Damaged item",
                "http://example.com/image.jpg"
        );

        when(repository.save(any())).thenAnswer(invocation -> invocation.getArgument(0));

        RefundRequest result = useCase.execute(command);

        assertNotNull(result);
        assertEquals(command.customerId(), result.getCustomerId());
        assertEquals(command.orderId(), result.getOrderId());
        assertEquals(command.productId(), result.getProductId());
        assertEquals(command.description(), result.getDescription());
        assertEquals(command.pictureUrl(), result.getPictureUrl());
        assertNotNull(result.getRequestedAt());
        assertNotNull(result.getId());

        verify(repository).save(any(RefundRequest.class));
    }

    @Test
    void shouldGenerateNewIdAndTimestamp() {
        RefundCommand command = new RefundCommand(
                2L,
                101L,
                201L,
                "Wrong product delivered",
                "http://example.com/evidence.jpg"
        );

        when(repository.save(any())).thenAnswer(invocation -> invocation.getArgument(0));

        RefundRequest result = useCase.execute(command);

        assertNotNull(result.getId(), "Refund request ID should be generated");
        assertNotNull(result.getRequestedAt(), "Refund request timestamp should be set");
    }
}
