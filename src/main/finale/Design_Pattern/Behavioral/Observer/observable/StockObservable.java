package main.finale.Design_Pattern.Behavioral.Observer.observable;

import main.finale.Design_Pattern.Behavioral.Observer.observerr.NotificationAlertObserver;

public interface StockObservable {

    void add(NotificationAlertObserver o);

    void remove(NotificationAlertObserver o);

    void notifySub();

    void setStockCount(int newStockCount);

    int getStockCount();

}
