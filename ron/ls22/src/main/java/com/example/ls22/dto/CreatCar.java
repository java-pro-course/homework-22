package com.example.ls22.dto;

public class CreatCar {
    private String brand;
    private String color;
    private int weight;
    private String drive;
    private Long speed;

    public CreatCar(String brand, String color, int weight, String drive, Long speed){
        this.brand = brand;
        this.color = color;
        this.weight = weight;
        this.drive = drive;
        this.speed = speed;
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