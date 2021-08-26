package com.luxoft.designpatterns.flyweight;

public class CreditOffer extends AbstractCreditOffer {

    @Override
    public void verifyOffer() {
        System.out.format("%s %n", getType());
    }
}
