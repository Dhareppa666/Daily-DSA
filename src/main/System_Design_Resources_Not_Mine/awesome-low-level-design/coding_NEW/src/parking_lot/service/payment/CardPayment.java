package parking_lot.service.payment;

public class CardPayment extends Payment{
    @Override
    public boolean initiateTransaction() {
        return false;
    }
}
