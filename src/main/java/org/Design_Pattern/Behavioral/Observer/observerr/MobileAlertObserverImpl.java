package org.Design_Pattern.Behavioral.Observer.observerr;

import org.Design_Pattern.Behavioral.Observer.observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String number;

    StockObservable observable;

    public MobileAlertObserverImpl(StockObservable observable, String number){
        this.observable = observable;
        this.number = number;
    }
    @Override
    public void update() {
        System.out.println("Sent SMS to : "+ number);
    }
}
