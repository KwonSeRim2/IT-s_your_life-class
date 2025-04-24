package test.D0424.test4;

public class RegularBuyer implements TicketBuyer {
    @Override
    public void waitTurn() {
        try {
            Thread.sleep(100);
            System.out.println("○○ 입장 완료!");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void entranceMessage(String name) {

    }
}
