package ch15.sec06.exam02;

import test.D0429.test2.QuizBox;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> messagesQ = new LinkedList<>();

        messagesQ.offer(new Message("sendMaile", "홍길동"));
        messagesQ.offer(new Message("sendSNS", "신용권"));
        messagesQ.offer(new Message("sendKakaotalk", "김자바"));

        while (!messagesQ.isEmpty()){
            Message messages = messagesQ.poll();
            switch (messages.command){
                case "sendMaile":
                    System.out.println(messages.to+"님에게 메일을 보냅니다.");
                    break;
                case "sendSNS":
                    System.out.println(messages.to+"님에게 SNS를 보냅니다.");
                    break;
                case "sendKakaotalk":
                    System.out.println(messages.to+"님에게 카카오톡을 보냅니다.");
                    break;
            }
        }
    }
}
