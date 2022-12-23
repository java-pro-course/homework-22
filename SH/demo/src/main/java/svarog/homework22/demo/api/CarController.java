package svarog.homework22.demo.api;

import org.springframework.web.bind.annotation.*;
import svarog.homework22.demo.dto.CreateNewCar;
import svarog.homework22.demo.entity.CarEntity;
import svarog.homework22.demo.service.CarService;

/**
 * Это контроллер
 */
@RestController
public class CarController {
    /**
     * Это экземпляр класса CarService, который нужен
     * чтоб просить сервис делать за нас грязную работёнку.
     */
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }


    /**
     * Просит сервис создать новый объект класса CarEntity, то есть новую машину.
     * @return Объект класса CarEntity
     */
    @PostMapping("create-car")
    public CarEntity createNewCar(@RequestBody CreateNewCar newCar){
        return carService.createNewCar(newCar);
    }
    /**
     * Просит сервис удалить объект класса CarEntity.
     * @param carId id нужной машины
     * @return Строку с id удалённого объекта
     */
    @GetMapping("delete-car-by-id/{carId}")
    public String deleteCarById(@PathVariable Long carId){
        return carService.deleteCarById(carId);
    }

    /**
     * Метод, который просит сервис изменить машину
     * @return строку с id изменённой машины
     */
    @PostMapping("change-car")
    public String changeCarById(@RequestBody CreateNewCar car){
        return carService.changeCar(car);
    }
}
