package main.finale.System_Design.LLD.stackoverflow.model;

public class Comment extends BaseCommentableEntity {
    private final String text;

    public Comment(User createdBy, String text) {
        super(createdBy);
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
