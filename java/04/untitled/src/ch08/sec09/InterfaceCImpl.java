package ch08.sec09;

public class InterfaceCImpl implements InterfaceC{

    @Override
    public void methodC() {
        System.out.println("Interface-methidC() 실행");

    }

    @Override
    public void methodA() {
        System.out.println("Interface-methidA() 실행");

    }

    @Override
    public void methodB() {
        System.out.println("Interface-methidB() 실행");

    }
}
