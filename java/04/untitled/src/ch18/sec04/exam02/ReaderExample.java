package ch18.sec04.exam02;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample {
    public static void main(String[] args) {
        try {
            Reader reader = null;

            //1 문자 하나로 읽기
            reader = new FileReader("C:\\Users\\student\\Desktop\\수업\\IT-s_your_life-class\\java\\04\\untitled\\src\\ch18\\sec04\\exam01\\test1.db");
            while (true) {
                int data = reader.read(); // 한문자씩 읽음
                if (data == -1) break;
                System.out.println((char) data);
            }

            reader.close();
            System.out.println();

            //2. 문자 배열로 읽기
            reader = new FileReader("C:\\Users\\student\\Desktop\\수업\\IT-s_your_life-class\\java\\04\\untitled\\src\\ch18\\sec04\\exam01\\test1.db");
            char[] data2= new char[100];
            while (true) {
                int num = reader.read(data2); // 한문자씩 읽음
                if (num == -1) break;
                for (int i = 0; i<num; i++){
                    System.out.println(data2[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
