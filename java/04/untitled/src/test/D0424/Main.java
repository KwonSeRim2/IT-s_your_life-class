package test.D0424;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new MusicRunnable();
        Thread thread2 = new MovieThread();

        thread2.start();
        thread1.start();
    }
}
