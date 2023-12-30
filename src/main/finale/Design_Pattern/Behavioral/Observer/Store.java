package main.finale.Design_Pattern.Behavioral.Observer;

import main.finale.aa.Design_Pattern.Behavioral.Observer.observable.IPhoneStockObservable;
import main.finale.aa.Design_Pattern.Behavioral.Observer.observable.StockObservable;
import main.finale.aa.Design_Pattern.Behavioral.Observer.observerr.MobileAlertObserverImpl;
import main.finale.aa.Design_Pattern.Behavioral.Observer.observerr.NotificationAlertObserver;

public class Store {

    public static void main(String[] args) {
        NotificationAlertObserver observer1 = new MobileAlertObserverImpl(new IPhoneStockObservable(), "65327854732");
        NotificationAlertObserver observer2 = new MobileAlertObserverImpl(new IPhoneStockObservable(), "93382483222");
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl(new IPhoneStockObservable(), "83846121581");

        StockObservable obj = new IPhoneStockObservable();
        obj.add(observer1);
        obj.add(observer2);
        obj.add(observer3);

        obj.setStockCount(25);

        obj.setStockCount(0);

        obj.setStockCount(25);
    }
}
