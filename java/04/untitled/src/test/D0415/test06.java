package test.D0415;

public class test06 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 8, 2};
        int temp = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                temp = array[i];
            } else {
                temp = array[i + 1];
            }
            ;
        }
        System.out.println(temp);
    }
}
