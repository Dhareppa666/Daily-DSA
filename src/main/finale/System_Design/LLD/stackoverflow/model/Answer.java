package main.finale.System_Design.LLD.stackoverflow.model;

public class Answer extends BaseCommentableEntity {
    private final String text;

    public Answer(User createdBy, String text) {
        super(createdBy);
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
