package com.luxoft.designpatterns.observer;

import java.io.Serializable;

public interface EventNotificationListener<T extends Client> extends Serializable {
    void onClientAdded(T client);
}