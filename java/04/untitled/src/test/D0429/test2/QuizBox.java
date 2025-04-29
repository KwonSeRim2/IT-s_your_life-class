package test.D0429.test2;

import java.util.Arrays;

public class QuizBox<T extends Content> {
    Object[] list;
    int size;

    public QuizBox() {
        list = new Object[5];
    }
    public void add(T content){
        if (size >= list.length) {
            list = Arrays.copyOf(list, list.length * 2);
        }

        list[size] = content;
        size++;
    }

    public boolean remove(Content content){
        for(int i = 0; i < size; i++){
            if(list[i].equals(content)){
                // 왼쪽으로 당기기
                for (int j = i; j < size - 1; j++) {
                    list[j] = list[j + 1];
                }
                list[size - 1] = null; // 마지막 자리는 비움
                size--;
                return true;
            }
        }
        return false;
    }


    static <T extends Content> void removeFromBox(QuizBox<? super T> box, T quiz){
        box.remove(quiz);
    }
    void printAll(){
        for(int i = 0 ; i < size; i++){
            System.out.print((i+1)+". ");
            System.out.println(((Content)list[i]).getQuestion());
        }
    }
}
