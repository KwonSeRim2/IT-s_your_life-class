package test.D0429.test2;

import java.util.Objects;

public class Quiz extends Content{
    String answer;

    public Quiz(String question, String answer) {
        super(question);
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }


}
