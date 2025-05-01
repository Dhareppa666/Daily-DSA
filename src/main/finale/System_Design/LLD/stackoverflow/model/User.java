package main.finale.System_Design.LLD.stackoverflow.model;

import java.util.*;

public class User implements Notifiable {
    private final UUID id;
    private final String username;
    private final String email;

    private final List<UUID> postIds = new ArrayList<>();
    private final List<Notification> notifications = new ArrayList<>();

    private User(Builder builder) {
        this.id = builder.id;
        this.username = builder.username;
        this.email = builder.email;
    }

    public void addPost(UUID postId) {
        postIds.add(postId);
    }

    @Override
    public void notifyUser(Notification notification) {
        this.notifications.add(notification);
    }

    public List<Notification> getUnreadNotifications() {
        return null;
//        return notifications.stream().filter(n -> !n.isRead()).toList();
    }

    public UUID getId() { return id; }
    public String getUsername() { return username; }

    public static class Builder {
        private UUID id = UUID.randomUUID();
        private String username;
        private String email;

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
