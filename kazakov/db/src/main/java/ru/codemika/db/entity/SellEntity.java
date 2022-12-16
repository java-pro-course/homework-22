package ru.codemika.db.entity;

import javax.persistence.*;

@Entity
@Table(schema = "kazakov", name = "sell")
public class SellEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "car_id")
    private Long carId;
    @Column(name = "price")
    private Long price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }



}
