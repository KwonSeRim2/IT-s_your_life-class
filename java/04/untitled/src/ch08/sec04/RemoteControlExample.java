package ch08.sec04;


public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;

        rc = new Television();
        rc.turnOn(); //자식인 Telecision의 turnOn()
        rc.setVolume(5);
        rc.turnOff();

        rc = new Audio();
        rc.turnOn(); // 자식인 Audio의 turnOn()
        rc.setVolume(5);
        rc.turnOff();
    }

}
