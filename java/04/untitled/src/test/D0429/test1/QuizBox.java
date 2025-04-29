package test.D0429.test1;

import java.util.Arrays;

public class QuizBox<T extends Quiz> {
    int size;
    T[] list;

    public QuizBox() {
        list = (T[]) new Quiz[5];
        this.size = 0;
    }

    public void addQuiz(T quiz) {
        if (size >= list.length) {
            list = Arrays.copyOf(list, list.length * 2);
        }

        list[size] = quiz;
        size++;


    }

    public void printAll(){
        for(int i = 0 ; i < size; i++){
            System.out.print((i+1)+". ");
            System.out.println(list[i].getQuestion());
        }
    }
}
