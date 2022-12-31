package com.example.ls22.service;

import com.example.ls22.dto.CreateMoto;
import com.example.ls22.entity.CarEntity;
import com.example.ls22.entity.MotoEntity;
import com.example.ls22.repository.MotoRepository;
import org.springframework.stereotype.Service;

@Service
public class MotoService {
    private final MotoRepository motoRepository;
        public MotoService(MotoRepository motoRepository){
            this.motoRepository = motoRepository;
    }
    public MotoEntity createMoto(CreateMoto request){
        MotoEntity newMoto = new MotoEntity();

        newMoto.setBrand(request.getBrand());
        newMoto.setColor(request.getColor());
        newMoto.setSpeed(request.getSpeed());
        return motoRepository.save(newMoto);
    }
    public String deleteMotoById(Long motoId){
       motoRepository.deleteById(motoId);
        return "moto has been deleted";
    }
    public MotoEntity changeMoto(Long Id, String brand, String color, int speed){
        MotoEntity changedMoto = motoRepository.findById(Id).get();

        changedMoto.setBrand(brand);
        changedMoto.setColor(color);
        changedMoto.setSpeed(speed);
        return changedMoto;
    }
}