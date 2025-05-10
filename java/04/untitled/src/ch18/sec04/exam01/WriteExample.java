package ch18.sec04.exam01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {
    public static void main(String[] args) {
        try (Writer writer = new FileWriter("C:\\Users\\student\\Desktop\\수업\\IT-s_your_life-class\\java\\04\\untitled\\src\\ch18\\sec04\\exam01\\test1.db")){
            char a = 'A';
            writer.write(a);
            char b = 'B';
            writer.write(b);

            //char 배열 출력
            char[] arr = {'C', 'D', 'E'};
            writer.write(arr);

            writer.write("FGH");

            writer.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
