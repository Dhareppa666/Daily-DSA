package parking_lot.service.payment;

public class CashPayment extends Payment{
    @Override
    public boolean initiateTransaction() {
        return false;
    }
}
