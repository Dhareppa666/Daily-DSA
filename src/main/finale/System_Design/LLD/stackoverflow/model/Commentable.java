package main.finale.System_Design.LLD.stackoverflow.model;

import java.util.List;

public interface Commentable<T extends Commentable<T>> {
    void addComment(Comment comment);
    List<Comment> getComments();
}
