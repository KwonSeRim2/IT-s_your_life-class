package ch18.sec02.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample2 {
    public static void main(String[] args) {
        //try-with-recources 구문 : os는 try블록이 끝나면 저절로 close된다
        try (OutputStream os =
                     new FileOutputStream("C:\\Users\\student\\Desktop\\수업\\IT-s_your_life-class\\java\\04\\untitled\\src\\ch18\\sec02\\exam01\\test2.db")){

            byte a = 10;
            byte b = 20;
            byte c = 30;

            //바이트 단위로 파일에 쓰기
            os.write(a);
            os.write(b);
            os.write(c);
        }catch (IOException e){
            // 예외 처리 : 어디서 예외 났는지(파일 사용 시 IOException 필수 처리)
            e.printStackTrace();
        }
    }
}
