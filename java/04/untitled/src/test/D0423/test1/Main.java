package test.D0423.test1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String name;
        Scanner scanner = new Scanner(System.in);
        GetName getName = new GetName();

        try {
            System.out.print("참가자 이름을 입력하세요: ");
            name = scanner.nextLine();

            getName.nameCheck(name);
        }catch (InvalidNameException e){
            String message = e.getMessage();
            System.out.println(message);
        }


    }
}
