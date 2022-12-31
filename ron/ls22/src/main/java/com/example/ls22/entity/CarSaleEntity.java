package com.example.ls22.entity;

import javax.persistence.*;

@Entity
@Table(schema = "ron", name = "car_sale")
public class CarSaleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name = "price")
    private Long price;
    @Column(name = "buyer")
    private String buyer;

    public Long getId(Long id) {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getPrice() {
        return this.price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getBuyer(String buyer) {
        return this.buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }
}
