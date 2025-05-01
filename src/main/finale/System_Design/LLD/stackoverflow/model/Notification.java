package main.finale.System_Design.LLD.stackoverflow.model;

import java.time.LocalDateTime;

public class Notification {
    private final String message;
    private final LocalDateTime createdAt;
    private boolean isRead = false;

    public Notification(String message) {
        this.message = message;
        this.createdAt = LocalDateTime.now();
    }

    public void markAsRead() {
        isRead = true;
    }

    public boolean isRead() {
        return isRead;
    }

    public String getMessage() {
        return message;
    }
}
