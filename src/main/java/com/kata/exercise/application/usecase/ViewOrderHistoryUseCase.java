package com.kata.exercise.application.usecase;

import com.kata.exercise.domain.model.Order;
import com.kata.exercise.domain.repository.OrderRepository;

import java.util.List;

public class ViewOrderHistoryUseCase {
    private final OrderRepository repository;

    public ViewOrderHistoryUseCase(OrderRepository repository) {
        this.repository = repository;
    }

    public List<Order> execute(Long customerId) {
        return repository.findByCustomerId(customerId);
    }
}
