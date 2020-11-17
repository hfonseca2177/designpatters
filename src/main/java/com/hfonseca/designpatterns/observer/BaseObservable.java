package com.hfonseca.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class BaseObservable<T> implements Observable<T>{

    protected List<Observer> observerList;

    public BaseObservable() {
        this.observerList = new ArrayList<Observer>();
    }

    @Override
    public void subscribe(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void broadcast(T message) {
        this.observerList.parallelStream().forEach(o -> o.updateState(message));
    }
}
