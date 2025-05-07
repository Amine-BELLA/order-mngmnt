package com.kata.exercise.infrastructure.persistence.adapter;

import com.kata.exercise.domain.model.RefundRequest;
import com.kata.exercise.domain.repository.RefundRequestRepository;
import com.kata.exercise.infrastructure.persistence.entity.RefundRequestEntity;
import com.kata.exercise.infrastructure.persistence.mapper.RefundRequestEntityMapper;
import com.kata.exercise.infrastructure.persistence.repository.RefundRequestJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class RefundRequestRepositoryImpl implements RefundRequestRepository {

    private final RefundRequestJpaRepository jpaRepository;

    @Override
    public RefundRequest save(RefundRequest request) {
        RefundRequestEntity entity = RefundRequestEntityMapper.toEntity(request);
        jpaRepository.save(entity);
        return request;
    }

}
