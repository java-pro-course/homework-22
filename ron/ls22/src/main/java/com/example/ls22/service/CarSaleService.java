package com.example.ls22.service;

import com.example.ls22.dto.SellCar;
import com.example.ls22.entity.CarSaleEntity;
import com.example.ls22.repository.CarSaleRepository;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.ArrayList;

@Service
public class CarSaleService {
    private final CarSaleRepository carSaleRepository;
    private ArrayList<CarSaleEntity> soldCars;
    public CarSaleService(CarSaleRepository carSaleRepository) {
        this.carSaleRepository = carSaleRepository;
    }

    public CarSaleEntity sellCar(SellCar request) {
        CarSaleEntity sellCar = new CarSaleEntity();
        sellCar.getId(request.getId());
        sellCar.getBuyer(request.getBuyer());
        sellCar.getPrice();
        return sellCar;
    }
    public String sellCar(Long carId) {
        CarSaleEntity car = carSaleRepository.findById(carId).get();
        soldCars.add(car);
        return "car has been sold";
    }
    public Long allPrices() {
        int s = 0;
        for (CarSaleEntity car : soldCars) {
            s += car.getPrice();
        }
        return Long.valueOf(s);
    }
}