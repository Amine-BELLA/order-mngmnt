package com.kata.exercise.infrastructure.persistence.mapper;

import com.kata.exercise.domain.model.RefundRequest;
import com.kata.exercise.infrastructure.persistence.entity.RefundRequestEntity;

public class RefundRequestEntityMapper {
    public static RefundRequestEntity toEntity(RefundRequest domain) {
        RefundRequestEntity entity = new RefundRequestEntity();
        entity.setId(domain.getId());
        entity.setCustomerId(domain.getCustomerId());
        entity.setOrderId(domain.getOrderId());
        entity.setProductId(domain.getProductId());
        entity.setDescription(domain.getDescription());
        entity.setPictureUrl(domain.getPictureUrl());
        entity.setRequestedAt(domain.getRequestedAt());
        return entity;
    }
}
