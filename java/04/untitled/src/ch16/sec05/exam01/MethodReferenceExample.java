package ch16.sec05.exam01;

import ch16.sec04.Person;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();

        //정적 메소드 경우
        //1. 람다식
        person.action((double x, double y)-> Computer.staticMethod(x,y));

        person.action(Computer :: staticMethod);

        Computer com = new Computer();
        person.action(((x, y) -> com.instanceMethod(x,y)));

        person.action(com :: instanceMethod);
    }
}
