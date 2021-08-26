package com.luxoft.designpatterns.iterator;

public interface Account {
    void withdraw(double amount) throws NotEnoughFundsException;

    double getBalance();
}
