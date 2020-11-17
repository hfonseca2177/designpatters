package com.hfonseca.designpatterns.observer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrintPrimeNumberObserver implements Observer<Integer>{

    private int printedCount = 0;
    Logger logger = LoggerFactory.getLogger(PrintPrimeNumberObserver.class);

    @Override
    public void updateState(Integer message) {
        logger.info("A: "+ message);
        printedCount++;
    }

    public int getPrintedCount(){
        return printedCount;
    }
}
