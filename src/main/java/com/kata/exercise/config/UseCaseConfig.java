package com.kata.exercise.config;

import com.kata.exercise.application.usecase.SubmitRefundRequestUseCase;
import com.kata.exercise.application.usecase.ViewOrderHistoryUseCase;
import com.kata.exercise.domain.repository.OrderRepository;
import com.kata.exercise.domain.repository.RefundRequestRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public ViewOrderHistoryUseCase viewOrderHistoryUseCase(OrderRepository repo) {
        return new ViewOrderHistoryUseCase(repo);
    }

    @Bean
    public SubmitRefundRequestUseCase submitRefundRequestUseCase(RefundRequestRepository repo) {
        return new SubmitRefundRequestUseCase(repo);
    }
}
