package ch15.sec06.exam03;

import ch15.sec06.exam03.command.SendKakaotalkCommand;
import ch15.sec06.exam03.command.SendMailCommand;
import ch15.sec06.exam03.command.Command;
import ch15.sec06.exam03.command.SendSNSCommand;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Map<String, Command> commands = new LinkedHashMap<>();// 순번이 아니라 string으로 선택하려면 map
        commands.put("sendMaile", new SendMailCommand());
        commands.put("sendSNS", new SendSNSCommand());
        commands.put("sendKakaotalk", new SendKakaotalkCommand());


        Queue<Message> messagesQ = new LinkedList<>();

        messagesQ.offer(new Message("sendMaile", "홍길동"));
        messagesQ.offer(new Message("sendSNS", "신용권"));
        messagesQ.offer(new Message("sendKakaotalk", "김자바"));

        while (!messagesQ.isEmpty()){
            Message messages = messagesQ.poll();

            Command command = commands.get(messages.command);
            if(command != null){
                command.execute(messages);
            }
        }
    }
}
