package svarog.homework22.demo.service;

import org.springframework.stereotype.Service;
import svarog.homework22.demo.dto.CreateNewCar;
import svarog.homework22.demo.entity.CarEntity;
import svarog.homework22.demo.repository.CarRepository;

import javax.transaction.Transactional;

/**
 * Это сервис, он делает за нас всю работу
 */
@Service
public class CarService {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    /**
     * Метод для создания нового экземпляра класса CarEntity(новой машины).
     * @param newCar это то что сервису передал контроллер.
     * @return Экземпляр класса CarEntity, то есть новую машину.
     */
    public CarEntity createNewCar(CreateNewCar newCar) {
        CarEntity car = new CarEntity();
        car.setBrand(newCar.getBrand());
        car.setMileage(newCar.getMileage());
        car.setModel(newCar.getModel());
        car.setColor(newCar.getColor());

        return carRepository.save(car);
    }
    /**
     * Метод для удаления экземпляра класса CarEntity(машины).
     * @param carId id машины, которую требуется удалить
     * @return Строку с id удалённой машины
     */
    public String deleteCarById(Long carId){
        carRepository.deleteById(carId);
        return String.format("<h1>Машина с id: %s успешно уничтожена</h1>", carId);
    }

    /**
     * Метод для изменения определённого параметра объекта класса CarEntity.
     * @param car это то что сервису передал контроллер
     * @return Строку с id изменённой машины
     */
    @Transactional
    public String changeCar(CreateNewCar car){
        carRepository.updateById(car.getBrand(), car.getModel(), car.getMileage(), car.getColor(), car.getId());
        return String.format("<h1>Машина с id: %s успешно изменена</h1>", car.getId());
    }
}
