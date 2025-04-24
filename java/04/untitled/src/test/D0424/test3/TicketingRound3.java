package test.D0424.test3;

public class TicketingRound3 {
    public static void main(String[] args) throws InterruptedException {
        EntryManager entryManager = new EntryManager();

        Fan[] fans = {
                new Fan("팬1", false, entryManager),
                new Fan("팬2", true, entryManager),
                new Fan("팬3", false, entryManager),
                new Fan("팬4", true, entryManager),
                new Fan("팬5", false, entryManager)
        };

        Thread[] Tfans = new Thread[fans.length];

        System.out.println("이벤트 시작! 남은 티켓: " + fans.length + "장");
        for (int i = 0; i < fans.length; i++) {
            Tfans[i] = new Thread(fans[i]);
            Tfans[i].start();

        }
        for (int i = 0; i < Tfans.length; i++) {

            try {
                Tfans[i].join();

            } catch (InterruptedException e) {
            }
        }


        System.out.println("이벤트 종료! 모두 수고하셨습니다 ✨");
    }
}
