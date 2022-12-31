package com.example.ls22.api;

import com.example.ls22.dto.SellCar;
import com.example.ls22.entity.CarSaleEntity;
import com.example.ls22.service.CarSaleService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarSaleController {
    public CarSaleService carSaleService;

    public CarSaleController(CarSaleService carSaleService) {
        this.carSaleService = carSaleService;
    }

    @GetMapping("buy-car/{Id}")
    public CarSaleEntity sellCar(@RequestBody SellCar request) {
        return carSaleService.sellCar(request);
    }
    @GetMapping("profit")
    public Long allPrices(){
        return carSaleService.allPrices();
    }
}
