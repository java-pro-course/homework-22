package com.example.hw22.api;


import com.example.hw22.Entity.MotoEntity;
import com.example.hw22.dto.CreateNewMoto;
import com.example.hw22.service.MotoService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
public class MotoController {

    private final MotoService motoService;

    public MotoController(MotoService motoService){
        this.motoService = motoService;
    }

    /**
     * Создание мотоцикла
     * @param request обЪект нового мотоцикла
     * @return сохранение мотоцикла
     */
    @PostMapping("create-new-moto")
    public MotoEntity createNewMoto(@RequestBody CreateNewMoto request){
        return motoService.createNewMoto(request);
    }

    /**
     * Удаление мотоцикла
     * @param motoId Id мотоцикла
     * @return Строка, что мотоцикл был удален
     */
    @GetMapping("delete-moto-by-id/{Id}")
    public String deleteMotoById(Long motoId){
        return motoService.deleteMotoById(motoId);
    }

    /**
     *
     * @param Id Id мотоцикла
     * @param brand бренд мотоцикла
     * @param model модель мотоцикла
     * @param horsepower мощность
     * @param dateCreate дата создания
     * @return отредактированная сущность мотоцикла
     */
    @GetMapping("edit-the-car/{Id}/{brand}/{model}/{horsepower}/{dateCreate}")
    public MotoEntity editTheMoto(@PathVariable Long Id, @PathVariable String brand, @PathVariable String model,
                                @PathVariable int horsepower, @PathVariable LocalDate dateCreate){
        return motoService.editTheMoto(Id, brand, model, horsepower, dateCreate);
    }
}
