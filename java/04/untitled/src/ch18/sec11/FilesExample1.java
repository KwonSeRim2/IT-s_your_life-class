package ch18.sec11;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FilesExample1 {
    public static void main(String[] args) throws IOException {
        //1. 파일 객체 생성
        File dir = new File("src/ch18/sec11/image");
        File file1 = new File("src/ch18/sec11/file1.txt");
        File file2 = new File("src/ch18/sec11/file2.txt");
        File file3 = new File("src/ch18/sec11/file3.txt");

        if(dir.exists() == false){dir.mkdir();}
        if(file1.exists() == false){file1.createNewFile();}
        if(file2.exists() == false){file2.createNewFile();}
        if(file3.exists() == false){file3.createNewFile();}

        //폴더 내용 출력
        File temp = new File("src/ch18/sec11");
        File[] contents = temp.listFiles();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
        for (File file: contents){
            System.out.printf("%-25s", sdf.format(new Date(file.lastModified())));
            if(file.isDirectory()) {
                System.out.printf("%-10s%-20s", "<DIR>", file.getName());
            } else {
                System.out.printf("%-10s%-20s", file.length(), file.getName());
            }
            System.out.println();
        }

    }
}
