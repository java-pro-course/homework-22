package com.example.ls22.repository;

import com.example.ls22.entity.CarEntity;
import com.example.ls22.entity.MotoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotoRepository extends JpaRepository<MotoEntity, Long> {
   MotoEntity findByBrandAndColorAndAndSpeed(String brand, String color, Long speed);
}
