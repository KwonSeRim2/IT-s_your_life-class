package ch16.sec05.exam01;

public class Computer {
    //action에 넣어서 사용학거라 calc의 형태를 따른다.
    //정적 메소드
    public static double staticMethod(double x, double y){
        return x+y;
    }
    //인스턴스 메소드
    public double instanceMethod(double x , double y){
        return x*y;
    }
}
