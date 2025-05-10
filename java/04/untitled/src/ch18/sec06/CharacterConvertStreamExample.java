package ch18.sec06;

import java.io.*;

public class CharacterConvertStreamExample {
    public static void main(String[] args) throws Exception{
        write("문자 변환 스트림을 사용합니다.");

        //저장된 내용을 다시 읽어와 출력
        String data = read();
        System.out.println(data);
    }
    //분자열을 파일에 저장
    public static void write(String str) throws Exception{
        OutputStream os = new FileOutputStream("src/ch18/sec06/test.txt");
        //바이트 스트림 변환
        Writer writer = new OutputStreamWriter(os, "UTF-8");
        writer.write(str);
        writer.flush();
        writer.close();

    }
    public static String read() throws Exception{
        InputStream is = new FileInputStream("src/ch18/sec06/test.txt");
        //바이트 문자 스트림 변환
        Reader reader = new InputStreamReader(is, "UTF-8");
        char[] data = new char[100];
        int num = reader.read(data);
        reader.close();

        //읽은 문자
        String str = new String(data, 0, num);
        return str;
    }
}
