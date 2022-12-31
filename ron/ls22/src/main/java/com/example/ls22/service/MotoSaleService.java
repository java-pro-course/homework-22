package com.example.ls22.service;

import com.example.ls22.dto.SellCar;
import com.example.ls22.dto.SellMoto;
import com.example.ls22.entity.CarSaleEntity;
import com.example.ls22.entity.MotoSaleEntity;
import com.example.ls22.repository.CarSaleRepository;
import com.example.ls22.repository.MotoSaleRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class MotoSaleService {private final MotoSaleRepository motoSaleRepository;
    private ArrayList<MotoSaleEntity> soldMoto;
    public MotoSaleService(MotoSaleRepository motoSaleRepository) {
        this.motoSaleRepository = motoSaleRepository;
    }

    public MotoSaleEntity sellMoto(SellMoto request) {
        MotoSaleEntity sellMoto = new MotoSaleEntity();
        sellMoto.getId(request.getId());
        sellMoto.getBuyer(request.getBuyer());
        sellMoto.getPrice();
        return sellMoto;
    }
    public String sellMoto(Long motoId) {
        MotoSaleEntity moto = motoSaleRepository.findById(motoId).get();
        soldMoto.add(moto);
        return "moto has been sold";
    }
    public Long allPrices() {
        int s = 0;
        for (MotoSaleEntity moto : soldMoto) {
            s += moto.getPrice();
        }
        return Long.valueOf(s);
    }
}

