package test.D0415;

public class test04 {
    public static void main(String[] args) {
        for(int i = 1; i<=15;i++){
            for(int j = 1; j<=12; j++){
                if(4*i + 5*j ==60){
                    System.out.println("("+i+","+j+")");
                }
                continue;
            }
        }
    }
}
