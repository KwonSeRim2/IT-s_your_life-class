package test.D0430.test2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class DollQueueManager {
    Queue<String> queue = new LinkedList<>();

    public void registerCustomer(String name){
        queue.offer(name);
        System.out.println(name+" 님이 대기열에 등록되었습니다.");
    }

    public void showWaitingList(){
        Iterator<String> iterator = queue.iterator();
        System.out.print("현재 대기열: ");
        System.out.print("[ ");

        while (iterator.hasNext()){
            String n = iterator.next();
            System.out.print(n+" ");

        }

        System.out.print("]");

        System.out.println();
    }

    public String getNextCustomer(){
        String n = queue.poll();
        System.out.println(n+" 님! 인형 뽑기 하러 오세요!");
        if(!queue.isEmpty()){
            return n;
        }
        return null;
    }
};
