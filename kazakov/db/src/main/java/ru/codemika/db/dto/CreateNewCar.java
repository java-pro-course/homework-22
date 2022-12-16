package ru.codemika.db.dto;

/**
 * Класс, который описывает json-запрос на создание нового пользователя
 * Отличие от Entity - отсутствие связки с таблицей и нет ID
 */
public class CreateNewCar {
    private String brand;


    private String model;
    private Long price;
    private String speed;

    public CreateNewCar(String brand, String model, Long price, String speed) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
}
