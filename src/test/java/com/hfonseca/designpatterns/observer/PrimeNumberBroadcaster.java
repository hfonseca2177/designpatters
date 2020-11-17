package com.hfonseca.designpatterns.observer;

public class PrimeNumberBroadcaster extends BaseObservable<Integer> {


    public void findAllPrimeNumbers(int min, int max){
        for(int i = min; i <= max; i++){
            if(isPrimeNumber(i)){
                broadcast(i);
            }
        }
    }

    private boolean isPrimeNumber(int number){
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public boolean hasSubscribers() {
        return this.observerList.size()>0;
    }


}
