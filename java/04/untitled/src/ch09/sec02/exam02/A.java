package ch09.sec02.exam02;

public class A {
    class B{
        int field =1;
        // fava 17부터 static가능
        static int field2 = 2;

        B(){
            System.out.println("B생성자 실행");
        }

        void method1(){
            System.out.println("B method실행");
        }

        static void method2(){
            System.out.println("Bmethod2실행");
        }
    }

    void useB(){
        B b = new B();
        System.out.println(b.field);
        b.method1();

        System.out.println(B.field2);
        B.method2();
    }
}
