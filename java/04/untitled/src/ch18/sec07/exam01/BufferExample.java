package ch18.sec07.exam01;

import javax.swing.plaf.IconUIResource;
import java.awt.*;
import java.io.*;

public class BufferExample {
    public static void main(String[] args) throws Exception {
        //1. 버퍼 미사용 : 일반 스트림
        String originalFilePath1 = BufferExample.class.getResource("/ch18/sec06/test.txt").getPath();
        System.out.println(originalFilePath1);
        String targetFilePath1 = "src/ch18/sec07/exam01/test.txt";
        FileInputStream fis = new FileInputStream(originalFilePath1);
        FileOutputStream fos = new FileOutputStream(targetFilePath1);

        //2. 버퍼 사용 : buffered스트림 추가
        String originalFilePath2 = BufferExample.class.getResource("/ch18/sec06/test.txt").getPath();
        String targetFilePath2 = "src/ch18/sec07/exam01/test2.txt";
        FileInputStream fis1 = new FileInputStream(originalFilePath2);
        FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
        BufferedInputStream bis = new BufferedInputStream(fis1);
        BufferedOutputStream bos = new BufferedOutputStream(fos2);

        //3. 복사시간 측정

        long nonBufferTime = copy(fis, fos);
        System.out.println("버퍼 미사용: \t" + nonBufferTime + " ns");

        long bufferTime = copy(bis, bos);
        System.out.println("버퍼 사용: \t" + bufferTime + " ns");


        fis.close();
        fos.close();
        bis.close();
        bos.close();

    }

    public static long copy(InputStream is, OutputStream os) throws Exception{
        long start = System.nanoTime();

        while (true){
            int data = is.read();
            if(data == -1)break;;
            os.write(data);
        }
        os.flush();

        long end = System.nanoTime();

        return (end - start);
    }
}
