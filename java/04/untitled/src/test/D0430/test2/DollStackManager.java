package test.D0430.test2;

import java.util.Iterator;
import java.util.Stack;

public class DollStackManager {
    String[] doll = {
            "피카츄", "리자몽", "꼬부기", "쿠로미", "헬로키티",
            "뽀로로", "짱구", "도라에몽", "스폰지밥", "미니언"
    };

    Stack<String > stack = new Stack<>();

    void storeRandomDoll(){
        int num = (int) (Math.random()*10)+1;
        stack.push(doll[num]);
        System.out.println(doll[num]+" 인형이 보관함에 추가되었습니다.");
    }
    void showStack(){
        Iterator<String> iterator = stack.iterator();
        System.out.print("현재 보관 중인 인형: ");
        System.out.print("[ ");

        while (iterator.hasNext()){
            String n = iterator.next();
            System.out.print(n+" ");

        }

        System.out.print("]");

        System.out.println();
    }
}
