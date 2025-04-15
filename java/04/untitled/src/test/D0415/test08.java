package test.D0415;

import java.util.Scanner;

public class test08 {
    public static void main(String[] args) {

        int amount = 0;
        boolean run = true;
        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("--------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("--------------------------------");
            System.out.print("선택> ");
            String input = scanner.nextLine();


            if (input.equals("1")) {
                System.out.print("예금액> ");

                int income = scanner.nextInt();
                amount += income;
            } else if (input.equals("2")) {
                System.out.print("출금액> ");

                int exp = scanner.nextInt();
                amount -= exp;
            } else if (input.equals("3")) {
                System.out.println(amount);
            } else if (input.equals("4")) {
                run = false;
            }
        }
    }
}
