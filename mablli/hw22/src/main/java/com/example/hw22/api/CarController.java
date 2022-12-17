package com.example.hw22.api;

import com.example.hw22.Entity.CarEntity;
import com.example.hw22.dto.CreateNewCar;
import com.example.hw22.dto.EditTheCar;
import com.example.hw22.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
public class CarController {

    private final CarService carService;

    public CarController(CarService carService){
        this.carService = carService;
    }

    @PostMapping("create-new-car")
    public CarEntity createNewCar(@RequestBody CreateNewCar request){
            return carService.createNewCar(request);
    }

    @GetMapping("delete-car-by-id/{Id}")
    public String deleteCarById(Long carId){
        return carService.deleteCarById(carId);
    }

    @GetMapping("edit-the-car/{Id}/{brand}/{model}/{horsepower}/{dateCreate}")
    public CarEntity editTheCar(@PathVariable Long Id, @PathVariable String brand, @PathVariable String model,
                                @PathVariable int horsepower, @PathVariable LocalDate dateCreate){
        return carService.editTheCar(Id, brand, model, horsepower, dateCreate);
    }
}
