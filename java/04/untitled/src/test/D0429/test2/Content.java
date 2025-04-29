package test.D0429.test2;

import java.util.Objects;

public class Content {
    String question;

    public Content(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Content content)) return false;
        return Objects.equals(question, content.question);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(question);
    }
}
