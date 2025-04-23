package ch11.sec03.exam01;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};

        for (int i = 0; i<=array.length; i++){
            try{// 예외가 발생할 수 있는 코드
                int value = Integer.parseInt(array[i]);
                System.out.println("array["+i+"]: "+value);
            }catch (ArrayIndexOutOfBoundsException e){//예외 원이 메시지
                System.out.println("배열 인덱스 초과됨: "+e.getMessage());
                System.out.println(e.toString());
            }catch (NumberFormatException e){
                System.out.println("숫자로 변환할 수 없음; "+e.getMessage());
            }

        }
    }
}
