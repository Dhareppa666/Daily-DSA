package main.finale.System_Design.LLD.stackoverflow.model;

import java.util.*;

public abstract class BaseCommentableEntity extends PostComponent implements Commentable<BaseCommentableEntity> {
    protected final List<Comment> comments = new ArrayList<>();

    public BaseCommentableEntity(User createdBy) {
        super(createdBy);
    }

    @Override
    public void addComment(Comment comment) {
        comments.add(comment);
    }

    @Override
    public List<Comment> getComments() {
        return Collections.unmodifiableList(comments);
    }
}
