package com.example.hw22.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Сущность продаваемого мотоцикла, связанная с БД
 */
@Entity
@Table(schema = "mab", name = "sale_moto")
public class SaleMotoEntity {
    @Column(name = "id")
    Long Id;
    @Column(name = "price")
    int price;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
