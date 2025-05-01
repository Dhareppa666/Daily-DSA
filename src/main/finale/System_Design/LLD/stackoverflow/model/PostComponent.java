package main.finale.System_Design.LLD.stackoverflow.model;

import java.time.LocalDateTime;
import java.util.*;

public abstract class PostComponent {
    protected final UUID id = UUID.randomUUID();
    protected final User createdBy;
    protected final LocalDateTime createdAt;
    protected final List<Reaction> reactions = new ArrayList<>();

    public PostComponent(User createdBy) {
        this.createdBy = createdBy;
        this.createdAt = LocalDateTime.now();
    }

    public void addReaction(Reaction reaction) {
        reactions.add(reaction);
    }

    public int getUpvotes() {
        return (int) reactions.stream().filter(r -> r.getType() == ReactionType.UPVOTE).count();
    }

    public int getDownvotes() {
        return (int) reactions.stream().filter(r -> r.getType() == ReactionType.DOWNVOTE).count();
    }

    public UUID getId() {
        return id;
    }
}
