package test.D0415;

public class test01 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1; i<=100; i++){
            if(i%3==0){
                sum+=i;
            }continue;
        }
        System.out.println(sum);
    }
}
