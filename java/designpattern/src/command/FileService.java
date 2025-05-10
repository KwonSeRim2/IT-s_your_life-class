package command;

import java.util.Stack;

public class FileService {
    String filename;

    //command 인터페이스에 준하는 메소드
    void open() {
        filename = "text.txt";
    }

    void print() {
        System.out.println(filename + "프린트 합니다.");
    }
}
