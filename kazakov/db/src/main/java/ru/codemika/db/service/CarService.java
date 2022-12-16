package ru.codemika.db.service;

import org.springframework.stereotype.Service;
import ru.codemika.db.dto.CreateNewCar;
import ru.codemika.db.entity.CarEntity;
import ru.codemika.db.repository.CarRepository;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public CarEntity createNewCar(CreateNewCar request) {
        CarEntity newCar = new CarEntity();

        newCar.setBrand(request.getBrand());
        newCar.setModel(request.getModel());
        newCar.setPrice(request.getPrice());
        newCar.setSpeed(request.getSpeed());

        return carRepository.save(newCar);
    }

    public String deleteCar(Long id) {
        carRepository.deleteById(id);
        return "deleted!";
    }

    public String updateCar(Long id, CreateNewCar request) {
        CarEntity newCar = carRepository.findById(id).get();

        newCar.setBrand(request.getBrand());
        newCar.setModel(request.getModel());
        newCar.setPrice(request.getPrice());
        newCar.setSpeed(request.getSpeed());

        carRepository.save(newCar);

        return "updated!";
    }
}
