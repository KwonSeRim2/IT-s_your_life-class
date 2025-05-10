package ch17.sec12.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("홍길동", "남", 92));
        totalList.add(new Student("김수영", "여", 87));
        totalList.add(new Student("김자바", "남", 95));
        totalList.add(new Student("오해영", "여", 93));

        //스트림을 사용하지 않는 경우
//        List<Student> maleList = new ArrayList<>();
//        for (Student student: totalList){
//            if(student.getSex().equals("남")){
//                maleList.add(student);
//            }
//        }

//        //스트림을 사용하는 경우
//        List<Student> maleList = totalList.stream().filter(s -> s.getSex().equals("남")).toList();
//
//        //이름 출력
//        maleList.stream().forEach(s -> System.out.println(s.getName()));
//
//        //mapping후 출력
//        maleList.stream().map(Student::getName).forEach(System.out::println);
//
//        //list자체에 forEach()험수 있음 => stream생략가능
//        maleList.forEach(s-> System.out.println(s.getName()));


//        //선언적 프로그래밍/함수적 프로그래밍
//        List<Student> topscore = totalList.stream()
//                .sorted((a,b)-> Integer.compare(b.getScore(), a.getScore()))
//                .limit(2)
//                .toList();
//
//        topscore.forEach(System.out::println);

        Map<String, Integer> map = totalList.stream()
                .collect(
                        Collectors.toMap(
                                s->s.getName(),
                                s->s.getScore()
                        )
                );

        System.out.println(map);


    }
}
