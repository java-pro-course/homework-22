package com.example.hw22.dto;

import java.time.LocalDate;

/**
 * Описание объекта авто без привязки к БД
 */
public class CreateNewCar {

    private String brand;
    private String model;
    private int horsepower;
    private LocalDate dateCreate;

    public CreateNewCar(String brand, String model, int horsepower, LocalDate dateCreate){
        this.brand = brand;
        this.model = model;
        this.horsepower = horsepower;
        this.dateCreate = dateCreate;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(LocalDate dateCreate) {
        this.dateCreate = dateCreate;
    }
}
