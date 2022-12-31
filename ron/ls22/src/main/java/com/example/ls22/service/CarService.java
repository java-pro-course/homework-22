package com.example.ls22.service;
import com.example.ls22.dto.CreatCar;
import com.example.ls22.entity.CarEntity;
import com.example.ls22.repository.CarRepository;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    private final CarRepository carRepository;
    public CarService(CarRepository carRepository){
        this.carRepository = carRepository;
    }
    public CarEntity createCar(CreatCar request){

        CarEntity newCar = new CarEntity();

        newCar.setBrand(request.getBrand());
        newCar.setColor(request.getColor());
        newCar.setWeight(request.getWeight());
        newCar.setDrive(request.getDrive());
         newCar.setSpeed(request.getSpeed());
        return carRepository.save(newCar);
    }
    public String deleteCarById(Long carId){
        carRepository.deleteById(carId);
        return "car has been deleted";
    }
    public CarEntity changeCar(Long Id, String brand, String color, int weight, String drive, Long speed){
        CarEntity changedCar = carRepository.findById(Id).get();

        changedCar.setBrand(brand);
        changedCar.setColor(color);
        changedCar.setWeight(weight);
        changedCar.setDrive(drive);
        changedCar.setSpeed(speed);
        return changedCar;
    }
}