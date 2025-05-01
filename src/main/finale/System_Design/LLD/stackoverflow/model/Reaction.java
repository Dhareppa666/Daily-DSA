package main.finale.System_Design.LLD.stackoverflow.model;

import java.time.LocalDateTime;

public class Reaction {
    private final User reactedBy;
    private final ReactionType type;
    private final LocalDateTime reactedAt;

    public Reaction(User user, ReactionType type) {
        this.reactedBy = user;
        this.type = type;
        this.reactedAt = LocalDateTime.now();
    }

    public ReactionType getType() {
        return type;
    }

    public User getUser() {
        return reactedBy;
    }
}
