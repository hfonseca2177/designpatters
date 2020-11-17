package com.hfonseca.designpatterns.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberListObserver implements Observer<Integer>{

    Logger logger = LoggerFactory.getLogger(PrimeNumberListObserver.class);

    private List<Integer> primeNumbers;

    public PrimeNumberListObserver() {
        primeNumbers = new ArrayList<Integer>();
    }

    @Override
    public void updateState(Integer message) {
        primeNumbers.add(message);
        logger.info("B: "+ primeNumbers.toString());
    }

    public List<Integer> getList(){
        return primeNumbers;
    }
}
