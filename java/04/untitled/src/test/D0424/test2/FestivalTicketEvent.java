package test.D0424.test2;

import org.w3c.dom.ls.LSOutput;

public class FestivalTicketEvent extends AbstractTicketEvent{

    public FestivalTicketEvent(int ticketCount) {
        super(ticketCount);
    }

    @Override
    protected void fanEntry() {
        Thread[] fans = new Thread[ticketCount];

        for (int i = 0; i<fans.length; i++){
            fans[i] = new Thread(){
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+" 티켓 구매 시도 중!" );
                }
            };
            fans[i].setName("팬"+(i+1));
            fans[i].start();


        }

        for (int i = 0; i< fans.length; i++){
            try {
                fans[i].join();
            }catch (InterruptedException e){}
        }
    }
}
