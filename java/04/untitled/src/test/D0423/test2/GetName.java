package test.D0423.test2;

import java.util.regex.Pattern;

public class GetName {

    public GetName() {

    }

    public void nameCheck(String name) throws InvalidNameException {
        if (Pattern.matches("^[가-힣]{2,10}$", name)) {
            System.out.println("(다음 단계로 진행합니다!)");
        } else {
            throw new InvalidNameException("😡 탈락! 잘못된 이름입니다: " + name);
        }

    }


}
