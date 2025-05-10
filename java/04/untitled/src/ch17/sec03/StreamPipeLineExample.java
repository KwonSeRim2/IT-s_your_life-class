package ch17.sec03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동", 10),
                new Student("신용권", 20),
                new Student("우미선", 30)
        );

        //방법1: stream 변수 분리
        Stream<Student> studentStream = list.stream();
        //중ㅇ간 처리 : 점수만 추출
        IntStream scoreStream = studentStream.mapToInt(student ->student.getScore());
        double avg = scoreStream.average().getAsDouble();
        System.out.println("평균점수: "+avg);

        //방법2; 파이프랑니 메소드 제이닝
        double avg2 = list.stream()
                .mapToInt(student->student.getScore()) //중간 처리
                .average() //최종처리
                .getAsDouble(); //결과 반환
        System.out.println("평균점수: "+avg2);
    }
}
