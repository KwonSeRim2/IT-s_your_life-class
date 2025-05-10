package ch17.sec06.exam01;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("홍길동", 85));
        students.add(new Student("홍길동", 92));
        students.add(new Student("홍길동", 87));

        //student 를 점수 (int) 로 매핑하여 출력
        students.stream()
                .mapToInt(s->s.getScore())//중간처리 : student->int점수
                .forEach(score-> System.out.println(score));//최종 처리: 출력

    }
}
