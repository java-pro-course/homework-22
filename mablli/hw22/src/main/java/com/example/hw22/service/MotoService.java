package com.example.hw22.service;


import com.example.hw22.Entity.MotoEntity;
import com.example.hw22.dto.CreateNewMoto;
import com.example.hw22.repository.MotoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

/**
 * Сервисный слой для мотоциклов
 */
@Service
public class MotoService {

    private final MotoRepository motoRepository;

    public MotoService(MotoRepository motoRepository){
        this.motoRepository = motoRepository;
    }

    /**
     * Создание мотоцикла
     * @param request объект мотоцикла
     * @return сохранение мотоцикла
     */
    public MotoEntity createNewMoto(CreateNewMoto request){

        MotoEntity newMoto = new MotoEntity();

        newMoto.setBrand(request.getBrand());
        newMoto.setModel(request.getModel());
        newMoto.setHorsepower(request.getHorsepower());
        newMoto.setDateCreate(request.getDateCreate());

        return motoRepository.save(newMoto);
    }

    /**
     * Удаление мотоцикла по id
     * @param motoId id мотоцикла
     * @return строку, что мотоцикл был удален
     */
    public String deleteMotoById(Long motoId){
        motoRepository.deleteById(motoId);
        return "Moto was deleted";
    }

    /**
     * Редактирование мотоцикла
     * @param Id id мотоцикла
     * @param brand брэнд мотоцикла
     * @param model модель мотоцикла
     * @param horsepower мощность
     * @param dateCreate дата создания
     * @return объект мотоцикла
     */
    public MotoEntity editTheMoto(Long Id, String brand, String model, int horsepower, LocalDate dateCreate){
        MotoEntity editedMoto = motoRepository.findById(Id).get();

        editedMoto.setBrand(brand);
        editedMoto.setModel(model);
        editedMoto.setHorsepower(horsepower);
        editedMoto.setDateCreate(dateCreate);

        return editedMoto;
    }
}
