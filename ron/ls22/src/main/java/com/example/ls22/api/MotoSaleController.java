package com.example.ls22.api;
import com.example.ls22.dto.SellMoto;
import com.example.ls22.entity.MotoSaleEntity;
import com.example.ls22.service.MotoSaleService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
public class MotoSaleController {public MotoSaleService motoSaleService;
    public MotoSaleController(MotoSaleService motoSaleService) {
        this.motoSaleService = motoSaleService;
    }
    @GetMapping("buy-moto/{Id}")
    public MotoSaleEntity sellCar(@RequestBody SellMoto request) {
        return motoSaleService.sellMoto(request);
    }
    @GetMapping("profit")
    public Long allPrices(){
        return motoSaleService.allPrices();
    }
}
