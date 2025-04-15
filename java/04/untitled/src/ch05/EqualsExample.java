package ch05;

public class EqualsExample {
    public static void main(String[] args) {
        String strVar1 = "홍길동";
        String strVar2 = "홍길동";

        if(strVar1==strVar2) {
            System.out.println("strVar1과 strVar2는 잠조가 같음");
        }else  {
            System.out.println("strVar1과 strVar2는 참조가 다름");
        }

        if(strVar1.equals(strVar2)) {
            System.out.println("strVar1과 strVar2는 문자열이 같음");
        }

        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");


        if(strVar3==strVar4) { //문자열을 new로 생성했을 경우에는 다른 주소값을 참조
            System.out.println("strVar1과 strVar2는 잠조가 같음");
        }else  {
            System.out.println("strVar1과 strVar2는 참조가 다름");
        }

        if(strVar3.equals(strVar4)) {
            System.out.println("strVar1과 strVar2는 문자열이 같음");
        }
    }
}
