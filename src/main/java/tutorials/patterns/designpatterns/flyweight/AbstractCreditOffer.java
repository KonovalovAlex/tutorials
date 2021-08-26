package com.luxoft.designpatterns.flyweight;

public abstract class AbstractCreditOffer {
    private String type;

    abstract void verifyOffer();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
