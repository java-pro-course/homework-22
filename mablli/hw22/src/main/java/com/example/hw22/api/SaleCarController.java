package com.example.hw22.api;

import com.example.hw22.service.SaleCarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Контроллер для покупки машины
 */
@RestController
public class SaleCarController {

    private final SaleCarService saleCarService;

    public SaleCarController(SaleCarService saleCarService){
        this.saleCarService = saleCarService;
    }

    /**
     * Покупка машины
     * @param Id
     * @return строку, что машина была куплена
     */
    @GetMapping("bye-car/{Id}")
    public String byeCar(@PathVariable Long Id){
        return saleCarService.byeCar(Id);
    }

    /**
     * Получить сумму продаж авто
     * @return сумму продаж
     */
    @GetMapping("get-sum-of-sales")
    public int getSum(){
       return saleCarService.getSum();
    }
}
