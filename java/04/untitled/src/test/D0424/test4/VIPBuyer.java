package test.D0424.test4;

public class VIPBuyer implements TicketBuyer {

    @Override
    public void waitTurn() {
        try {
            Thread.sleep(10);
            System.out.println("VIP ○○ 입장 완료!");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void entranceMessage(String name) {

    }
}
