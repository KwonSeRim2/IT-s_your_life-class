package test.D0430.test3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DollQueueManager dollQueueManager = new DollQueueManager();
        DollStackManager dollStackManager = new DollStackManager();
        DollHistoryManager dollHistoryManager = new DollHistoryManager();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== 유라의 인형뽑기 가게 ===");
            System.out.println("[1] 고객 등록");
            System.out.println("[2] 뽑기 진행 (보관 + 기록)");
            System.out.println("[3] 현재 대기열 보기");
            System.out.println("[4] 보관함 보기");
            System.out.println("[5] 고객별 인형 기록 보기");
            System.out.println("[0] 종료");
            System.out.print("선택>> ");
            int sel = scanner.nextInt();

            switch (sel) {
                case 1:
                    String name = RandomCustomerProvider.getRandomCustomer();
                    dollQueueManager.registerCustomer(name);
                    break;

                case 2:
                    String topName = dollQueueManager.getNextCustomer();
                    String curDoll = dollStackManager.storeRandomDoll();
                    dollHistoryManager.addHistory(topName, curDoll);
                    System.out.println(topName+" 님의 인형 기록에 '"+curDoll+"'이 추가되었습니다.");
                    break;

                case 3:
                    dollQueueManager.showWaitingList();
                    break;

                case 4:
                    dollStackManager.showStack();
                    break;

                case 5:
                    dollHistoryManager.showAllHistory();

                default:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);

            }
            System.out.println();
        }
    }
}
