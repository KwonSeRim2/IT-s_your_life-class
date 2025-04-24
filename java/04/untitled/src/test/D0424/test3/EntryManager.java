package test.D0424.test3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class EntryManager {
    private Stack<Fan> vipStack = new Stack<>();
    private Queue<Fan> normalQueue = new LinkedList<>();
    private int ticketCount;

    public void registerFan(Fan fan) {
        if (fan.isVIP()) {
            vipStack.push(fan);
        } else {
            normalQueue.offer(fan);
        }
    }

    synchronized public boolean processEntry(Fan fan) {

        if (!vipStack.isEmpty()) {
            if (vipStack.peek() == fan) {
                System.out.println("VIP " + fan.getName() + " 입장 완료!");
                vipStack.pop();
            } else {
                return false;
            }
        } else {

            if (normalQueue.peek() == fan) {
                System.out.println(fan.getName() + " 입장 완료!");
                normalQueue.poll();

            } else {
                return false;
            }
        }


        return true;
    }
}
