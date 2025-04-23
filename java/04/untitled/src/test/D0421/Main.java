package test.D0421;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Payment payments = null;
        Scanner scanner = new Scanner(System.in);
        PaymentManager pm = new PaymentManager();

        while (true) {
            System.out.println("=== 유니페이 결제 시스템 ===");
            System.out.println("[1] 신용카드");
            System.out.println("[2] 카카오페이");
            System.out.print("결제 수단을 선택하세요: ");

            int i = scanner.nextInt();

            if (i == 1) {
                payments = new CreditCard();
            } else if (i == 2) {
                payments = new KakaoPay();

                System.out.println("[카카오페이 사용자 인증을 진행하시겠습니까? (y/n)]: ");
                scanner.nextLine();
                System.out.print(">> ");
                String a = scanner.nextLine();


                if (a.equalsIgnoreCase("y")) {
                    ((KakaoPay) payments).authenticate();
                }

            } else if (i == 0) {
                break;
            }
        }

        pm.printSummary();



    }


}
