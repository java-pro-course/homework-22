package svarog.homework22.demo.service;

import org.springframework.stereotype.Service;
import svarog.homework22.demo.dto.CreateNewCar;
import svarog.homework22.demo.entity.CarEntity;
import svarog.homework22.demo.entity.SaleEntity;
import svarog.homework22.demo.repository.CarRepository;
import svarog.homework22.demo.repository.SaleRepository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Это сервис, он делает за нас всю работу
 */
@Service
public class CarService {
    private final CarRepository carRepository;
    private final SaleRepository saleRepository;

    public CarService(CarRepository carRepository, SaleRepository saleRepository) {
        this.carRepository = carRepository;
        this.saleRepository = saleRepository;
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


    public String sellCarById(SaleEntity car){
        saleRepository.save(car);
        carRepository.deleteById(car.getCarId());
        return String.format("Машина успешно продана. Вы заработали %d рублей", car.getPrice());
    }

    public int allSale(){
        List<SaleEntity> sales = saleRepository.findAll();
        int selling = 0;
        for(SaleEntity sale : sales){
            selling += sale.getPrice();
        }
        return selling;
    }
}
