package svarog.homework22.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import svarog.homework22.demo.entity.SaleEntity;

@Repository
public interface SaleRepository extends JpaRepository<SaleEntity, Long> {

}
