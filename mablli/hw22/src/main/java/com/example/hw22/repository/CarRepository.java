package com.example.hw22.repository;

import com.example.hw22.Entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Репозиторий для авто
 */
@Repository
public interface CarRepository extends JpaRepository<CarEntity, Long> {
}
