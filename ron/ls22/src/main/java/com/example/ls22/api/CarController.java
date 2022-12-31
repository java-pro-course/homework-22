package com.example.ls22.api;

import com.example.ls22.dto.CreatCar;
import com.example.ls22.entity.CarEntity;
import com.example.ls22.service.CarService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
    private final CarService carService;

    public CarController(CarService carService){
        this.carService = carService;
    }
    @PostMapping("create-car")
    public CarEntity createCar(@RequestBody CreatCar request){
        return carService.createCar(request);
    }

    @GetMapping("delete-car-by-id/{Id}")
    public String deleteCarById(Long carId){
        return carService.deleteCarById(carId);
    }

    @GetMapping("edit-the-car/{Id}/{brand}/{model}/{horsepower}/{dateCreate}")
    public CarEntity changeCar(@PathVariable Long Id, @PathVariable String brand, @PathVariable String color,
                                @PathVariable String drive, @PathVariable int weight, @PathVariable Long speed){
        return carService.changeCar(Id, brand, color, weight, drive, speed);
    }
}