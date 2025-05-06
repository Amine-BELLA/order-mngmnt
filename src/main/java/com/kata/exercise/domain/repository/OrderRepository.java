package com.kata.exercise.domain.repository;

import com.kata.exercise.domain.model.Order;

import java.util.List;

public interface OrderRepository {
    List<Order> findByCustomerId(Long customerId);
}
