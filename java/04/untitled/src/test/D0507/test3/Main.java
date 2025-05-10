package test.D0507.test3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    private static List<Goods> giftPool = new ArrayList<>(Arrays.asList(
            new Goods("메타몽 쿠션", "분홍", false),
            new Goods("메타몽 키링", "파랑", false),
            new Goods("메타몽 텀블러", "보라", true),
            new Goods("메타몽 노트북 파우치", "회색", true),
            new Goods("메타몽 인형", "분홍", false),
            new Goods("메타몽 가방", "회색", true)
    ));


    public static List<Goods> pickGifts(List<Goods> pool) {
        List<Goods> copy = new ArrayList<>(pool);

        int num1 = (int)(Math.random() * copy.size());
        Goods goods1 = copy.get(num1);
        copy.remove(num1);

        int num2 = (int)(Math.random() * copy.size());
        Goods goods2 = copy.get(num2);
        copy.remove(num2);

        return Arrays.asList(goods1, goods2);
    }

    public static void printResult(String user, List<Goods> picks, Predicate<Goods> condition
            , String successMsg, String failMsg) {
        System.out.println("[" + user + "의 뽑기 결과]");
        boolean suc = false;

        for (Goods goods : picks) {
            if (condition.test(goods) == true) {
                suc = true;
            }
            System.out.println("- " + goods.getName());

        }
        if (suc == false) {
            System.out.println(failMsg);
        } else {
            System.out.println(successMsg);
        }

    }


    public static void main(String[] args) {
        printResult("지우", pickGifts(giftPool), t -> {
            return t.isUseful();
        }, "성공! 유용한 굿즈를 얻었어요!", "실패! 유용한 굿즈가 없어요");
        System.out.println();
        printResult("이슬이", pickGifts(giftPool), t -> {
            if (t.getColor() == "분홍") {
                return true;
            }
            return false;
        }, "성공! 분홍색 굿즈를 얻었어요!", "실패! 분홍색 굿즈가 없어요");


    }
}
