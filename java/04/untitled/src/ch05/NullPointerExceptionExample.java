package ch05;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        //null인값을 사용하면 nullPointerException발생
        int [] intArray = null;

        //intArray[0] = 10;

        String str = null;
        System.out.println("종 문자수 : "+str.length());
    }
}
