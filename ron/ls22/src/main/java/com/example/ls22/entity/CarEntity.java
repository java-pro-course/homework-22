package com.example.ls22.entity;
import javax.persistence.*;

@Entity
@Table(schema = "ron", name = "car")
public class CarEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name = "brand")
    private String brand;
    @Column(name= "color")
    private  String color;
    @Column(name = "weight")
    private int weight;
    @Column(name = "drive")
    private String drive;
   @Column(name= "speed")
    private Long speed;
    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
       Id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    public Long getSpeed() {
        return speed;
    }

    public void setSpeed(Long speed) {
        this.speed = speed;
    }
}

