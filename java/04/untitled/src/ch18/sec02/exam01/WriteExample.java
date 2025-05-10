package ch18.sec02.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        try {
            OutputStream os =
                    new FileOutputStream("C:\\Users\\student\\Desktop\\수업\\IT-s_your_life-class\\java\\04\\untitled\\src\\ch18\\sec02\\exam01\\test1.db");

            byte a = 10;
            byte b = 20;
            byte c = 30;

            //바이트 단위로 파일에 쓰기
            os.write(a);
            os.write(b);
            os.write(c);

            //flush로 출력 버퍼 비우기 -> 저장
            os.flush();
            //스트림 닫기(리소스 해제)
            os.close();
        }catch (IOException e){
            // 예외 처리 : 어디서 예외 났는지(파일 사용 시 IOException 필수 처리)
            e.printStackTrace();
        }
    }
}
