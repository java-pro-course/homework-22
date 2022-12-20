package com.example.hw22.repository;

import com.example.hw22.Entity.MotoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Репозиторий для мотоцикла
 */
public interface MotoRepository extends JpaRepository<MotoEntity, Long> {
}
