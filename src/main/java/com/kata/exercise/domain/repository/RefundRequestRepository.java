package com.kata.exercise.domain.repository;

import com.kata.exercise.domain.model.RefundRequest;

public interface RefundRequestRepository {
    RefundRequest save(RefundRequest request);
}
