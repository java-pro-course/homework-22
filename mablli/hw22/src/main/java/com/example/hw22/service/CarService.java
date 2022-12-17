package com.example.hw22.service;

import com.example.hw22.Entity.CarEntity;
import com.example.hw22.dto.CreateNewCar;
import com.example.hw22.dto.EditTheCar;
import com.example.hw22.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository){
        this.carRepository = carRepository;
    }

        public CarEntity createNewCar(CreateNewCar request){

            CarEntity newCar = new CarEntity();

            newCar.setBrand(request.getBrand());
            newCar.setModel(request.getModel());
            newCar.setHorsepower(request.getHorsepower());
            newCar.setDateCreate(request.getDateCreate());

            return carRepository.save(newCar);
        }

        public String deleteCarById(Long carId){
            carRepository.deleteById(carId);
            return "Car was deleted";
        }

        public CarEntity editTheCar(Long Id, String brand, String model, int horsepower, LocalDate dateCreate){
            CarEntity editedCar = carRepository.findById(Id).get();

            editedCar.setBrand(brand);
            editedCar.setModel(model);
            editedCar.setHorsepower(horsepower);
            editedCar.setDateCreate(dateCreate);

            return editedCar;
        }
}
