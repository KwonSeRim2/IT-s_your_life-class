package ch08.sec10.exam02;

public class CastingExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();
        vehicle.run();
//        vehicle.checkFare(); 부모에 없는 메소트 , 불가
        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();
    }


}
