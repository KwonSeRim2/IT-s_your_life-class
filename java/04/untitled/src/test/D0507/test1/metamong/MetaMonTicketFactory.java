package test.D0507.test1.metamong;

import test.D0507.test1.framework.Ticket;
import test.D0507.test1.framework.TicketFactory;

public class MetaMonTicketFactory extends TicketFactory {

    @Override
    protected Ticket createTicket(String owner) {

        return new MetaMonTicket(owner);
    }

    @Override
    protected void registerTicket(Ticket ticket) {
        System.out.println("티켓 "+ticket.toString()+"] 등록 완료");
    }
}
