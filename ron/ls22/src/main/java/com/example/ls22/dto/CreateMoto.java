package com.example.ls22.dto;

public class CreateMoto {
    private Long Id;
    private String brand;
private String color;
private int speed;
public CreateMoto(Long Id,String brand, String color, int speed){
    this.Id = Id;
    this.brand = brand;
    this.color = color;
    this.speed = speed;
}

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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
