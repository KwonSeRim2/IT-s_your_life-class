package ch15.sec06.exam02;

public class Message {
    public String command; //어떤식으로 전달할지
    public String to; //누구에게

    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }
}
