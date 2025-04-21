package ch07.sec04.exam02;

public class SupersonicAirplaneExample {
    public static void main(String[] args) {
        SupersonicAirplane as = new SupersonicAirplane();

        as.takeOff();
        as.fly();
        as.flyMode = SupersonicAirplane.SUPERSONIC;
        as.fly();
        as.flyMode = SupersonicAirplane.NORMAL;
        as.fly();
        as.land();
    }
}
