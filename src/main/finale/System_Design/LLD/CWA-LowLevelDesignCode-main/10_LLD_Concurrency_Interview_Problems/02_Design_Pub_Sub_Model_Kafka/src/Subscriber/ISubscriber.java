package main.finale.System_Design.LLD.CWA;
import model.Message;

public interface ISubscriber {
    String getId();
    void onMessage(Message message) throws InterruptedException;
}
