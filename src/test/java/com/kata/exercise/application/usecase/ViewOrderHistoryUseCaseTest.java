package com.kata.exercise.application.usecase;

import com.kata.exercise.domain.model.Order;
import com.kata.exercise.domain.repository.OrderRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ViewOrderHistoryUseCaseTest {
    private OrderRepository orderRepository;
    private ViewOrderHistoryUseCase useCase;

    @BeforeEach
    void setUp() {
        orderRepository = mock(OrderRepository.class);
        useCase = new ViewOrderHistoryUseCase(orderRepository);
    }

    @Test
    void shouldReturnOrdersForCustomer() {
        Long customerId = 1L;
        Order dummyOrder = new Order(
                100L,
                customerId,
                LocalDateTime.now(),
                List.of()
        );

        when(orderRepository.findByCustomerId(customerId))
                .thenReturn(List.of(dummyOrder));

        List<Order> result = useCase.execute(customerId);

        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals(dummyOrder, result.get(0));
        verify(orderRepository).findByCustomerId(customerId);
    }

    @Test
    void shouldReturnEmptyListWhenNoOrdersFound() {
        Long customerId = 2L;
        when(orderRepository.findByCustomerId(customerId))
                .thenReturn(List.of());

        List<Order> result = useCase.execute(customerId);

        assertNotNull(result);
        assertTrue(result.isEmpty());
        verify(orderRepository).findByCustomerId(customerId);
    }

}
