package test.D0507.test1.metamong;

import test.D0507.test1.framework.Ticket;

public class MetaMonTicket extends Ticket {



    public MetaMonTicket(String name) {
        super(name);
        System.out.println("["+name+"]님의 메타몽 티켓을 발급합니다.");
    }

    @Override
    public void enter() {
        System.out.println("[MetaMonTicket: "+name+"]님이 입장하였습니다.");
    }
}
