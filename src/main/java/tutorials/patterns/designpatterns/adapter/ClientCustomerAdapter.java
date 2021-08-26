package com.luxoft.designpatterns.adapter;

public class ClientCustomerAdapter implements Client {

    private Customer customer;

    public ClientCustomerAdapter(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String greet() {
        return customer.salut();
    }

}
