package com.example.hw22.repository;

import com.example.hw22.Entity.SaleMotoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Репозиторий для продаваемого мотоцикла
 */
public interface SaleMotoRepository extends JpaRepository<SaleMotoEntity, Long> {
}
