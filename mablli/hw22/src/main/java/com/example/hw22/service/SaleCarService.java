package com.example.hw22.service;

import com.example.hw22.Entity.SaleCarEntity;
import com.example.hw22.repository.SaleCarRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Сервисный слой для продаваемой машины
 */
@Service
public class SaleCarService {

        private final SaleCarRepository saleCarRepository;
        private ArrayList<SaleCarEntity> soldCars;

        public SaleCarService(SaleCarRepository saleCarRepository){
            this.saleCarRepository = saleCarRepository;
        }

    /**
     * Покупка машины
     * @param Id id машины, которую надо купить
     * @return строку, что машина куплена
     */
    public String byeCar(Long Id){
            SaleCarEntity car = saleCarRepository.findById(Id).get();
            soldCars.add(car);
            return "Car was sold";
        }

    /**
     * Получиение суммы продаж авто
     * @return сумму продаж
     */
    public int getSum(){
            int sum = 0;

            for (SaleCarEntity car : soldCars) {
                sum += car.getPrice();
            }
            return sum;
        }
}
