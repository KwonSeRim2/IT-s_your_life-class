package ch18.sec03.exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) {
        try (InputStream is = new FileInputStream(("C:\\Users\\student\\Desktop\\수업\\IT-s_your_life-class\\java\\04\\untitled\\src\\ch18\\sec02\\exam02\\test1.db"))) {
            byte[] data = new byte[100];
            while (true) {
                //data 배열읭 바이트 데이터 읽고 읽은 바이트 수 변환
                int num = is.read(data);
                if(num == -1) break; //파일 끝에 도달시
                for (int i = 0; i <num; i++){
                    System.out.println(data[i]);
                };
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
