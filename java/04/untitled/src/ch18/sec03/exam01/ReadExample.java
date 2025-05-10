package ch18.sec03.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) {
        try (InputStream is = new FileInputStream(("C:\\Users\\student\\Desktop\\수업\\IT-s_your_life-class\\java\\04\\untitled\\src\\ch18\\sec02\\exam01\\test1.db"))) {
            while (true) {
                //1바이트씩 읽기
                int data = is.read();
                if(data == -1) break; //파일 끝에 도달시
                System.out.println(data);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
