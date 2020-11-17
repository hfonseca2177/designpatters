package com.hfonseca.designpatterns.observer;

public interface Observable<T> {

    void subscribe(Observer observer);

    void unsubscribe(Observer observer);

    void broadcast(T message);


}
