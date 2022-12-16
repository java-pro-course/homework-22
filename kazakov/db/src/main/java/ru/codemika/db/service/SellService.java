package ru.codemika.db.service;

import org.springframework.stereotype.Service;
import ru.codemika.db.dto.CreateNewSell;
import ru.codemika.db.repository.SellRepository;
import ru.codemika.db.entity.SellEntity;

import java.util.List;

@Service
public class SellService {

    private final SellRepository sellRepository;

    public SellService(SellRepository sellRepository) {
        this.sellRepository = sellRepository;
    }

    public SellEntity createNewSell(CreateNewSell request) {
        SellEntity newSell = new SellEntity();

        newSell.setCarId(request.getCarId());
        newSell.setPrice(request.getPrice());

        return sellRepository.save(newSell);
    }

    public Long totalGet(){
        List<SellEntity> sells = sellRepository.findAll();
        Long money = 0L;

        for (int i = 0; i < sells.size(); i++) {
            SellEntity sell = sells.get(i);
            money += sell.getPrice();
        }

        return money;
    }

}
