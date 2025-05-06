package com.kata.exercise.infrastructure.persistence.repository;

import com.kata.exercise.infrastructure.persistence.entity.RefundRequestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RefundRequestJpaRepository extends JpaRepository<RefundRequestEntity, UUID> {
}
