package com.kata.exercise.infrastructure.persistence.adapter;

import com.kata.exercise.domain.model.Order;
import com.kata.exercise.domain.repository.OrderRepository;
import com.kata.exercise.infrastructure.persistence.mapper.OrderEntityMapper;
import com.kata.exercise.infrastructure.persistence.repository.SpringDataOrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class OrderRepositoryImpl implements OrderRepository {

    private final SpringDataOrderRepository springDataOrderRepository;

    @Override
    public List<Order> findByCustomerId(Long customerId) {
        return springDataOrderRepository.findByCustomerId(customerId).stream()
                .map(OrderEntityMapper::toDomain)
                .collect(Collectors.toList());
    }
}
