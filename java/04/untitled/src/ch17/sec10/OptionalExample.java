package ch17.sec10;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

//        // list에 요소가 엉ㅄ기 때문에 NoSuchElementException 발생
//        double avg = list.stream()
//                .mapToInt(Integer:: intValue)
//                .average()
//                .getAsDouble();

        OptionalDouble optionalDouble = list.stream()
                .mapToInt(Integer::intValue)
                .average();
        if (optionalDouble.isPresent()){
            System.out.println(optionalDouble.getAsDouble());
        }else {
            System.out.println(0.0);
        }

        double avg2 = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0); //값이 없으면 기본값 0.0
        System.out.println(avg2);


        list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(a-> System.out.println(a));

    }
}
