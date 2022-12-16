package ru.codemika.db.dto;

/**
 * Класс, который описывает json-запрос на создание нового пользователя
 * Отличие от Entity - отсутствие связки с таблицей и нет ID
 */
public class CreateNewSell {
    private Long carId;
    private Long price;

    public CreateNewSell(Long carId, Long price) {
        this.carId = carId;
        this.price = price;
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
