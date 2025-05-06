package com.kata.exercise.infrastructure.web.controller;

import com.kata.exercise.application.usecase.ViewOrderHistoryUseCase;
import com.kata.exercise.infrastructure.web.dto.OrderDto;
import com.kata.exercise.infrastructure.web.mapper.OrderMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/customers/{customerId}/orders")
@RequiredArgsConstructor
public class OrderController {
    private final ViewOrderHistoryUseCase useCase;

    @GetMapping
    public List<OrderDto> getOrders(@PathVariable Long customerId) {
        return useCase.execute(customerId).stream()
                .map(OrderMapper::toDto)
                .collect(Collectors.toList());
    }
}
