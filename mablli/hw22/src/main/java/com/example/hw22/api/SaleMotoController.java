package com.example.hw22.api;

import com.example.hw22.service.SaleCarService;
import com.example.hw22.service.SaleMotoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaleMotoController {

    private final SaleMotoService saleMotoService;

    public SaleMotoController(SaleMotoService saleMotoService){
        this.saleMotoService = saleMotoService;
    }

    /**
     * Покупка мотоцикла
     * @param Id
     * @return строку, что мотоцикл был куплен
     */
    @GetMapping("bye-moto/{Id}")
    public String byeMoto(@PathVariable Long Id){
        return saleMotoService.byeMoto(Id);
    }

    /**
     * Получить сумму продаж мотоциклов
     * @return сумма продаж
     */
    @GetMapping("get-sum-of-sales")
    public int getSum(){
        return saleMotoService.getSum();
    }
}
