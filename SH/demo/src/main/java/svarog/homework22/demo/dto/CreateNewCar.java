package svarog.homework22.demo.dto;

/**
 * Класс для создания новой машины
 */
public class CreateNewCar {
    private Long id;
    private String brand;
    private String model;
    private Long mileage;
    private String color;

    public CreateNewCar(Long id, String brand,String model ,Long mileage, String color) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.mileage = mileage;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Long getMileage() {
        return mileage;
    }

    public void setMileage(Long mileage) {
        this.mileage = mileage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
