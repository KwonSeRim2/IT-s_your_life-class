package ch15.sec06.exam03.command;

import ch15.sec06.exam03.Message;

public class SendSNSCommand implements Command {

    @Override
    public void execute(Message messages) {
        System.out.println(messages.to+"님에게 SNS를 보냅니다.");

    }
}
