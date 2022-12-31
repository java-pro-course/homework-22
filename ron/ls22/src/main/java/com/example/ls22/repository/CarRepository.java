package com.example.ls22.repository;

import com.example.ls22.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<CarEntity, Long> {
    CarEntity findByBrandAndColorAndWeightAndDriveAndSpeed(String brand, String color, int weight, String drive, Long speed);
}
