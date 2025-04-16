package ch06.sec08.exam02;

public class Computer {
    public Computer() {
    }

    int sum(int... x) {
        int sum = 0;

        for (int i = 0; i< x.length; i++) {
            sum += x[i];
        }
        return sum;
    }
}
