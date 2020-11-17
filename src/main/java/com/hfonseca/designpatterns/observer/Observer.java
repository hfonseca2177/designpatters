package com.hfonseca.designpatterns.observer;

public interface Observer<T> {

    void updateState(T message);
}
