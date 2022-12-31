package com.example.ls22.api;
import com.example.ls22.dto.CreateMoto;
import com.example.ls22.entity.MotoEntity;
import com.example.ls22.service.MotoService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MotoController {
     private final MotoService motoService;
    public MotoController(MotoService motoService){
            this.motoService = motoService;}
        @PostMapping("create-moto")
        public MotoEntity createMoto(@RequestBody CreateMoto request){
            return motoService.createMoto(request);}
        @GetMapping("delete-moto-by-id/{Id}")
        public String deleteCarById(Long motoId){
            return motoService.deleteMotoById(motoId);
        }
        @GetMapping("change-moto/{Id}/{brand}/{color}/{speed}")
        public MotoEntity changeMoto(@PathVariable Long Id, @PathVariable String brand, @PathVariable String color, @PathVariable int speed){
            return motoService.changeMoto(Id, brand, color, speed);
        }
    }

