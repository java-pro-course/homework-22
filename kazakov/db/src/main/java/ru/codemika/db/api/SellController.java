package ru.codemika.db.api;

import org.springframework.web.bind.annotation.*;
import ru.codemika.db.dto.CreateNewSell;
import ru.codemika.db.entity.SellEntity;
import ru.codemika.db.service.SellService;

@RestController
public class SellController {

    private final SellService sellService;

    public SellController(SellService sellService) {
        this.sellService = sellService;
    }

    @PostMapping("create-new-sell")
    public SellEntity createUser(@RequestBody CreateNewSell requestObject) {
        return sellService.createNewSell(requestObject);
    }

    @GetMapping("total")
    public Long totalGet() {
        return sellService.totalGet();
    }
}

/**
   curl -X POST "http://localhost:8080/create-new-sell" \
        -H "Content-Type: application/json" \
        -d "{
        \"carId\": 1,
        \"price\": 1000000
        }"
 **/