package com.example.hw22.service;

import com.example.hw22.Entity.CarEntity;
import com.example.hw22.Entity.SaleCarEntity;
import com.example.hw22.dto.CreateNewCar;
import com.example.hw22.dto.EditTheCar;
import com.example.hw22.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Сервисный слой для машины
 */
@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository){
        this.carRepository = carRepository;
    }

    /**
     * Создание машины
     * @param request объект машины
     * @return сохранение машины
     */
    public CarEntity createNewCar(CreateNewCar request){

        CarEntity newCar = new CarEntity();

        newCar.setBrand(request.getBrand());
        newCar.setModel(request.getModel());
        newCar.setHorsepower(request.getHorsepower());
        newCar.setDateCreate(request.getDateCreate());

        return carRepository.save(newCar);
    }

    /**
     * Удаление машины по id
     * @param carId id машины
     * @return строку, что машина была удалена
     */
    public String deleteCarById(Long carId){
        carRepository.deleteById(carId);
        return "Car was deleted";
    }

    /**
     * Редактирование машины
     * @param Id id машины
     * @param brand брэнд машины
     * @param model модель машины
     * @param horsepower мощность
     * @param dateCreate дата создания
     * @return объект машины
     */
    public CarEntity editTheCar(Long Id, String brand, String model, int horsepower, LocalDate dateCreate){
        CarEntity editedCar = carRepository.findById(Id).get();

        editedCar.setBrand(brand);
        editedCar.setModel(model);
        editedCar.setHorsepower(horsepower);
        editedCar.setDateCreate(dateCreate);

        return editedCar;
    }
}