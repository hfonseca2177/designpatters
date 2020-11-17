package com.hfonseca.designpatterns.observer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ObserverTests {

    private PrimeNumberBroadcaster primeNumberBroadcaster;

    @Test
    void when_subscribing_an_observer_and_result_is_successful(){
        PrimeNumberBroadcaster primeNumberBroadcaster  = new PrimeNumberBroadcaster();
        PrintPrimeNumberObserver printObserver = new PrintPrimeNumberObserver();
        primeNumberBroadcaster.subscribe(printObserver);
        assertTrue(primeNumberBroadcaster.hasSubscribers());
    }

    @Test
    void when_unsubscribing_an_observer_and_result_is_successful(){
        PrimeNumberBroadcaster primeNumberBroadcaster  = new PrimeNumberBroadcaster();
        PrintPrimeNumberObserver printObserver = new PrintPrimeNumberObserver();
        primeNumberBroadcaster.subscribe(printObserver);
        primeNumberBroadcaster.unsubscribe(printObserver);
        assertFalse(primeNumberBroadcaster.hasSubscribers());
    }

    @Test
    void when_observable_broadcast_and_result_is_successful(){
        PrimeNumberBroadcaster primeNumberBroadcaster  = new PrimeNumberBroadcaster();

        PrintPrimeNumberObserver printObserver = new PrintPrimeNumberObserver();
        PrimeNumberListObserver listObserver = new PrimeNumberListObserver();

        primeNumberBroadcaster.subscribe(printObserver);
        primeNumberBroadcaster.subscribe(listObserver);

        primeNumberBroadcaster.findAllPrimeNumbers(1,100);

        assertFalse(listObserver.getList().isEmpty());
        assertTrue(printObserver.getPrintedCount()>0);

    }

}
