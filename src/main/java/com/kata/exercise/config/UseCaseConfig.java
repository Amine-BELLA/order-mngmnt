package com.kata.exercise.config;

import com.kata.exercise.application.usecase.ViewOrderHistoryUseCase;
import com.kata.exercise.domain.repository.OrderRepository;
import com.kata.exercise.infrastructure.persistence.adapter.OrderRepositoryImpl;
import com.kata.exercise.infrastructure.persistence.repository.SpringDataOrderRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {
    @Bean
    public OrderRepository orderRepository(SpringDataOrderRepository springRepo) {
        return new OrderRepositoryImpl(springRepo);
    }

    @Bean
    public ViewOrderHistoryUseCase viewOrderHistoryUseCase(OrderRepository repo) {
        return new ViewOrderHistoryUseCase(repo);
    }
}
