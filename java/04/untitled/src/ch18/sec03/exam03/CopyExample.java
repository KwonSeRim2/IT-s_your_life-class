package ch18.sec03.exam03;

import java.io.*;

public class CopyExample {
    public static void main(String[] args) {
        String originalFileName = "C:\\Users\\student\\Desktop\\수업\\IT-s_your_life-class\\java\\04\\untitled\\src\\ch18\\sec02\\exam02\\test1.db";
        String targetFileName = "C:\\Users\\student\\Desktop\\수업\\IT-s_your_life-class\\java\\04\\untitled\\src\\ch18\\sec03\\exam03\\test2.db";

        try (//입력스트림: 원본파일 읽기
             InputStream is = new FileInputStream(originalFileName);
             //출력 스트림 : 대상 파일 쓰기
             OutputStream os = new FileOutputStream(targetFileName);) {
            byte[] data = new byte[1024];
            while (true) {
                //최대 1024바이트 읽기
                int num = is.read(data);
                if (num == -1) break;
                //읽은반큼 대상 파일에 쓰기
                os.write(data, 0, num);

            }
            os.flush();
            System.out.println("복사가 되었습니다.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
