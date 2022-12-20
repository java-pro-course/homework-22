package com.example.hw22.dto;

import java.time.LocalDate;

/**
 * Описание редактирования авто
 */
public class EditTheCar {

    private String newBrand;
    private String newModel;
    private int newHorsepower;
    private LocalDate newDateCreate;


    public EditTheCar(String newBrand, String newModel, int newHorsepower, LocalDate newDateCreate){
            this.newBrand = newBrand;
            this.newModel = newModel;
            this.newHorsepower = newHorsepower;
            this.newDateCreate = newDateCreate;
    }

    public int getNewHorsepower() {
        return newHorsepower;
    }

    public void setNewHorsepower(int newHorsepower) {
        this.newHorsepower = newHorsepower;
    }

    public String getNewBrand() {
        return newBrand;
    }

    public void setNewBrand(String newBrand) {
        this.newBrand = newBrand;
    }

    public String getNewModel() {
        return newModel;
    }

    public void setNewModel(String newModel) {
        this.newModel = newModel;
    }

    public LocalDate getNewDateCreate() {
        return newDateCreate;
    }

    public void setNewDateCreate(LocalDate newDateCreate) {
        this.newDateCreate = newDateCreate;
    }
}
