package ru.codemika.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.codemika.db.entity.SellEntity;

@Repository
public interface SellRepository extends JpaRepository<SellEntity, Long> {
}
