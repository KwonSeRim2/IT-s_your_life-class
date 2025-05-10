package ch16.sec05.exam03;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        Person peerson = new Person();

        Member m1 = peerson.getMember1(Member::new);
        System.out.println(m1);
        System.out.println();

        Member m2 = peerson.getMember2(Member::new);
        System.out.println(m2);
    }
}
