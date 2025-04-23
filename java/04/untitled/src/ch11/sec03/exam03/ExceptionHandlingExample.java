package ch11.sec03.exam03;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo", null, "200"};

        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]: " + value);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("배열 인덱스 초과됨: "+e.getMessage());

            }catch (NullPointerException e){
                System.out.println("null값을 사용: "+e.getMessage());

            }catch (NumberFormatException e){
                System.out.println("숫자로 변환할 수 없음: "+e.getMessage());
            }
        }
        }
    }
