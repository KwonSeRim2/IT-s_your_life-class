package cTest;

import java.util.Scanner;
import java.util.Stack;

public class Main1 {
    public static void main(String[] args) {
        int[] A = null;
        int[] out = null;
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        int n = scanner.nextInt();

        A = new int[n];
        out = new int[n];


        for (int i = n - 1; i < 0; i--) {

            int in = scanner.nextInt();
            A[i] = in;
            stack.push(in);
        }

        //반복문
        while (stack != null) {
            int num = stack.pop();
            int max = 0;
            count += 1;


            for (int i = count; i < A.length; i++) {
                if (num < A[i]) {
                    max = A[i];
                } else {
                    continue;
                }

            }

            out[count - 1] = max;
        }


        for (int i = 0; i < A.length; i++) {
            System.out.print(out[i]);

        }

    }

}
