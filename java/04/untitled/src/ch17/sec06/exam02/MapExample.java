package ch17.sec06.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapExample {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};
        IntStream intStream1 = Arrays.stream(intArray);

        intStream1
                .asDoubleStream()
                .forEach(d-> System.out.println(d));

        System.out.println();

        //int ->Integer 객체 스트림변환
        intStream1 = Arrays.stream(intArray);
        intStream1
                .boxed()
                //래퍼 객체에서 .intvalues()로 다시 int 추출 가능
                .forEach(obj-> System.out.println(obj.intValue()));
    }
}
