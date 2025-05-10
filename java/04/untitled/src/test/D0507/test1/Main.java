package test.D0507.test1;

import test.D0507.test1.framework.Ticket;
import test.D0507.test1.framework.TicketFactory;
import test.D0507.test1.metamong.MetaMonTicketFactory;

public class Main {
    public static void main(String[] args) {
        TicketFactory factory = new MetaMonTicketFactory();
        Ticket jiwoo = factory.create("지우");
        Ticket isul = factory.create("이슬이");

        System.out.println();

        jiwoo.enter();
        isul.enter();
    }
}
