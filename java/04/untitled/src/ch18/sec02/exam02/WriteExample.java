package ch18.sec02.exam02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        try (OutputStream os =
                     new FileOutputStream("C:\\Users\\student\\Desktop\\수업\\IT-s_your_life-class\\java\\04\\untitled\\src\\ch18\\sec02\\exam02\\test1.db")){
            //파일에 저장할 바이트 배열 생성
            byte[] array = {10, 20, 30};

            //바이트 배열 전체를 파일에 한 번에 출력
            os.write(array);

        }  catch (IOException e) { // 예외 발생시 오류 내용 줄력
            throw new RuntimeException(e);
        }
    }
}
