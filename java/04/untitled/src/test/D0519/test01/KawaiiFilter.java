package test.D0519.test01;

public class KawaiiFilter implements FilterStrategy{

    @Override
    public String apply(String input) {
        String out = "";
        for (int i = input.length()-1; i>=0 ;i--){
            out += input.charAt(i);
        }
        return out+"🌸";
    }
}
