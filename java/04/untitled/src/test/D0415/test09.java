package test.D0415;

import java.util.Scanner;

public class test09 {
    public static void main(String[] args) {

        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        int[] scores = null;
        int count = 0;


        while (run) {
            System.out.println("-------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-------------------------------------------------");
            System.out.print("선택> ");

            int input = scanner.nextInt();

            if (input==1) {
                System.out.print("학생수> ");

                count = scanner.nextInt();

            } else if (input==2) {

                scores = new int[count];

                for (int i = 0; i < count; i++) {
                    System.out.print("score[" + i + "]> ");
                    int score = scanner.nextInt();
                    scores[i] = score;
                }

            } else if (input==3) {
                for (int i = 0; i < count; i++) {
                    System.out.println("score[" + i + "]: " + scores[i]);

                }

            } else if (input==4) {
                int max = 0;

                for (int i = 0; i < count - 1; i++) {
                    if (scores[i] > scores[i + 1]) {
                        max = scores[i];
                    } else {
                        max = scores[i + 1];
                    }

                }

                System.out.println("최고점수: " + max);
                System.out.println("평균점수: " + max / count);
            } else if (input==5) {
                run = false;
                System.out.println("프로그램 종료");
            }
        }
    }
}
