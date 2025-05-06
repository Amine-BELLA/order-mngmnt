package com.kata.exercise.infrastructure.persistence.adapter;

import com.kata.exercise.domain.model.RefundRequest;
import com.kata.exercise.domain.repository.RefundRequestRepository;
import com.kata.exercise.infrastructure.persistence.entity.RefundRequestEntity;
import com.kata.exercise.infrastructure.persistence.repository.RefundRequestJpaRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RefundRequestRepositoryImpl implements RefundRequestRepository {

    private final RefundRequestJpaRepository jpaRepository;

    @Override
    public RefundRequest save(RefundRequest request) {
        RefundRequestEntity entity = new RefundRequestEntity();
        entity.setId(request.getId());
        entity.setCustomerId(request.getCustomerId());
        entity.setOrderId(request.getOrderId());
        entity.setProductId(request.getProductId());
        entity.setDescription(request.getDescription());
        entity.setPictureUrl(request.getPictureUrl());
        entity.setRequestedAt(request.getRequestedAt());

        jpaRepository.save(entity);
        return request;
    }

}
