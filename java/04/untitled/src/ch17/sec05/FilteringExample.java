package ch17.sec05;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("홍길동");
        list.add("신용권");
        list.add("감자바");
        list.add("신용권");
        list.add("신민철");

        list.stream()
                .distinct() //중복요소 제거
                .forEach(n-> System.out.println(n));
        System.out.println();

        list.stream()
                //신으로 시작하느 요소만 필터링
                .filter(n->n.startsWith("신"))
                .forEach(n-> System.out.println(n));
        System.out.println();

        list.stream()
                //위의 두개 합침
                .distinct()
                .filter(n->n.startsWith("신"))
                .forEach(n-> System.out.println(n));
        System.out.println();
    }
}
