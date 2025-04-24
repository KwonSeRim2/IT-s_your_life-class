package test.D0424.test1;

public class TicketingRound1 {


    public static void main(String[] args) {
        Thread fan1 = new Thread() {
            @Override
            public void run() {

                System.out.println(Thread.currentThread().getName() + " 티켓 구매 시도 중!");
            }
        };
        fan1.setName("팬1");

        Thread fan2 = new Thread() {
            @Override
            public void run() {

                System.out.println(Thread.currentThread().getName() + " 티켓 구매 시도 중!");
            }
        };
        fan2.setName("팬2");
        System.out.println("==run() 지접 호출==");
        fan1.run();
        fan1.start();

        fan2.run();
        fan2.start();

    }


}
