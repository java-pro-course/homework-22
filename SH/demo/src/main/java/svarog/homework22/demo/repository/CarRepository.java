package svarog.homework22.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import svarog.homework22.demo.entity.CarEntity;

@Repository
public interface CarRepository extends JpaRepository<CarEntity, Long> {

    @Modifying
    @Query("update CarEntity car set car.brand = ?1, car.model = ?2, car.mileage = ?3, car.color = ?4 where car.id = ?5 ")
    void updateById(String brand, String model, Long mileage, String color, Long id);
}
