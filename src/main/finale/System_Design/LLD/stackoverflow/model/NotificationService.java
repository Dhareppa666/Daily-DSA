package main.finale.System_Design.LLD.stackoverflow.model;

public class NotificationService {
    public void sendNotification(Notifiable notifiable, String message) {
        notifiable.notifyUser(new Notification(message));
    }
}
