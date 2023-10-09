package main.finale.Design_Pattern.Behavioral.Observer.observable;

import main.finale.Design_Pattern.Behavioral.Observer.observerr.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneStockObservable implements StockObservable {

    private int stockCount = 0;

    public List<NotificationAlertObserver> observerList = new ArrayList<>();

    @Override
    public void add(NotificationAlertObserver obj) {
        observerList.add(obj);
    }

    @Override
    public void remove(NotificationAlertObserver obj) {
        observerList.remove(obj);
    }

    @Override
    public void notifySub() {
        for(NotificationAlertObserver obj : observerList){
            obj.update();
        }
    }

    @Override
    public void setStockCount(int newStockCount) {
        if(this.stockCount == 0){
            notifySub();
        }
        this.stockCount = newStockCount;
    }

    @Override
    public int getStockCount() {
        return this.stockCount;
    }
}
