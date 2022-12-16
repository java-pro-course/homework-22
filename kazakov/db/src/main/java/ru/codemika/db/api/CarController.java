package ru.codemika.db.api;

import org.springframework.web.bind.annotation.*;
import ru.codemika.db.dto.CreateNewCar;
import ru.codemika.db.entity.CarEntity;
import ru.codemika.db.service.CarService;

@RestController
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping("create-new-car")
    public CarEntity createUser(@RequestBody CreateNewCar requestObject) {
        return carService.createNewCar(requestObject);
    }

    @GetMapping("delete-car/{id}")
    public String deleteCar(@PathVariable Long id) {
        return carService.deleteCar(id);
    }

    @PostMapping("update-car/{id}")
    public String updateCar(@PathVariable Long id, @RequestBody CreateNewCar requestObject){
        return carService.updateCar(id, requestObject);
    }
}
/**
   curl -X POST "http://localhost:8080/create-new-car" \
        -H "Content-Type: application/json" \
        -d "{
        \"brand\": \"LADA\",
        \"model\": \"Niva\",
        \"price\": 1000000,
        \"speed\": \"1000\"
        }"
 **/