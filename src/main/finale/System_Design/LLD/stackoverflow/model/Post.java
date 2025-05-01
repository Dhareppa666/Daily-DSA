package main.finale.System_Design.LLD.stackoverflow.model;

import java.util.*;

public class Post extends BaseCommentableEntity {
    private final String title;
    private final String text;
    private final List<Answer> answers = new ArrayList<>();

    public Post(User createdBy, String title, String text) {
        super(createdBy);
        this.title = title;
        this.text = text;
    }

    public void addAnswer(Answer answer) {
        answers.add(answer);
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public String getText() {
        return text;
    }

    public String getTitle() {
        return title;
    }
}
