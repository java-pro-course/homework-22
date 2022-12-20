package com.example.hw22.api;

import com.example.hw22.Entity.CarEntity;
import com.example.hw22.Entity.SaleCarEntity;
import com.example.hw22.dto.CreateNewCar;
import com.example.hw22.dto.EditTheCar;
import com.example.hw22.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

/**
 * Контроллер для управления автомобилями
 */
@RestController
public class CarController {

    private final CarService carService;

    public CarController(CarService carService){
        this.carService = carService;
    }

    /**
     * Создание машины
     * @param request обЪект новой машины
     * @return сохранение машины
     */
    @PostMapping("create-new-car")
    public CarEntity createNewCar(@RequestBody CreateNewCar request){
            return carService.createNewCar(request);
    }

    /**
     * Удаление машины
     * @param carId Id машины
     * @return Строка, что машина была удалена
     */
    @GetMapping("delete-car-by-id/{Id}")
    public String deleteCarById(Long carId){
        return carService.deleteCarById(carId);
    }

    /**
     *
     * @param Id Id машины
     * @param brand бренд машины
     * @param model модель машины
     * @param horsepower мощность
     * @param dateCreate дата создания
     * @return отредактированная сущность машины
     */
    @GetMapping("edit-the-car/{Id}/{brand}/{model}/{horsepower}/{dateCreate}")
    public CarEntity editTheCar(@PathVariable Long Id, @PathVariable String brand, @PathVariable String model,
                                @PathVariable int horsepower, @PathVariable LocalDate dateCreate){
        return carService.editTheCar(Id, brand, model, horsepower, dateCreate);
    }
}
