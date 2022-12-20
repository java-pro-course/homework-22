package com.example.hw22.service;

import com.example.hw22.repository.SaleMotoRepository;
import com.example.hw22.Entity.SaleMotoEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Сервисный слой для продаваемых мотоциклов
 */
@Service
public class SaleMotoService {

    private final SaleMotoRepository saleMotoRepository;
    private ArrayList<SaleMotoEntity> soldMotoes;

    public SaleMotoService(SaleMotoRepository saleMotoRepository){
        this.saleMotoRepository = saleMotoRepository;
    }

    /**
     * Покупка мотоцикла
     * @param Id id мотоцикла, который надо купить
     * @return строку, что мотоцикл куплен
     */
    public String byeMoto(Long Id){
        SaleMotoEntity moto = saleMotoRepository.findById(Id).get();
        soldMotoes.add(moto);
        return "Moto was sold";
    }

    /**
     * Получиение суммы продаж мотоциклов
     * @return сумму продаж
     */
    public int getSum(){
        int sum = 0;

        for (SaleMotoEntity moto : soldMotoes) {
            sum += moto.getPrice();
        }
        return sum;
    }
}
