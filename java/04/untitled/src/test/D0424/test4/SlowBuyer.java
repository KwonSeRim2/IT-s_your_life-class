package test.D0424.test4;

public class SlowBuyer implements TicketBuyer{
    @Override
    public void waitTurn() {
        try {
            Thread.sleep(200);
            System.out.println("○○: 처음이라 떨려요... 입장 완료!");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void entranceMessage(String name) {

    }
}
