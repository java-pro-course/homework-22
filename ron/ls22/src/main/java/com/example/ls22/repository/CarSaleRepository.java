package com.example.ls22.repository;

import com.example.ls22.entity.CarSaleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarSaleRepository extends JpaRepository<CarSaleEntity, Long> {
}
