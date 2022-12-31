package com.example.ls22.dto;

public class SellMoto {
    private Long Id;
    private Long price;
    private String buyer;
    public SellMoto(Long price, String buyer, Long Id){
        this.price=price;
        this.buyer=buyer;
        this.Id = Id;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String seller) {
        this.buyer = buyer;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }
}
