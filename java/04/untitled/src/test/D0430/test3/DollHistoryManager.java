package test.D0430.test3;

import java.util.*;

public class DollHistoryManager {
    Map<String, List<String>> historyMap = new HashMap<>();

    public void addHistory(String customer, String doll){
        List<String> history = historyMap.getOrDefault(customer, new ArrayList<>());
        history.add(doll); // 인형 추가
        historyMap.put(customer, history);
    }
    public void showAllHistory(){
        Set<String > names = historyMap.keySet();

        for (String n: names){
            System.out.print("- "+n+": ");
            System.out.print("[ ");
            for (String d :historyMap.get(n)){
                System.out.print(d+" ");
            }
            System.out.println("]");
        }
    }
}
