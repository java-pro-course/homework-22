package com.example.hw22.repository;

import com.example.hw22.Entity.SaleCarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Репозиторий для продаваемой авто
 */
@Repository
public interface SaleCarRepository extends JpaRepository<SaleCarEntity, Long> {
}
