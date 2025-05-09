package test.D0422.test6;

public class Player {
    public void logTitle(String title) {

        class Logger {
            String title;  // ❗ title이 가려짐

            public Logger(String title) {
                this.title = title;
            }

            public void print() {
                System.out.println("제목: " + title);
            }
        }

        Logger logger = new Logger(title);
        logger.print();
    }

    public static void main(String[] args) {
        new Player().logTitle("사건의 지평선");
    }
}
