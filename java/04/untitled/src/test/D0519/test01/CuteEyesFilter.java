package test.D0519.test01;

public class CuteEyesFilter implements FilterStrategy{

    @Override
    public String apply(String input) {
        String out = input.replace("a", "👁");
        out = out.replace("e", "👁");
        out = out.replace("i", "👁");
        out = out.replace("o", "👁");
        out = out.replace("u", "👁");

        return out;
    }
}
