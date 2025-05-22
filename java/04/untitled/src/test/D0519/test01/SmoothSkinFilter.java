package test.D0519.test01;

public class SmoothSkinFilter implements FilterStrategy{

    @Override
    public String apply(String input) {
        String out = input.toLowerCase();
        return out + "✨";
    }
}
