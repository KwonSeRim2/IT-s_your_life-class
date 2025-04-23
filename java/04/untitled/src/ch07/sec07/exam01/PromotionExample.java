package ch07.sec07.exam01;

class A{
}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}

public class PromotionExample {
    B b= new B();
    C c = new C();
    D d = new D();
    E e = new E();

    //부모객체에 자식 객체를 넣으면 가능
    A a1 = b;

    //상속관계가 아니라면 에러발생
}
