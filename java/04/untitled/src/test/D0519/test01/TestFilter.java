package test.D0519.test01;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class TestFilter {
    public static void main(String[] args) {
        Map<String, FilterStrategy> map = new HashMap<>();
        FilterStrategy f1 = new SmoothSkinFilter();
        FilterStrategy f2 = new CuteEyesFilter();
        FilterStrategy f3 = new KawaiiFilter();

        map.put("smooth", f1);
        map.put("cute", f2);
        map.put("kawaii", f3);

        Scanner scanner = new Scanner(System.in);
        System.out.println("📷 AI 필터 엔진에 오신 걸 환영합니다!");
        System.out.println("✨ 사용할 필터를 선택해주세요 (smooth, cute, kawaii, exit)");

        while (true) {
            System.out.print(">> 적용할 필터 입력: ");
            String filter = scanner.nextLine().toLowerCase(Locale.ROOT);
            if (filter.equals("exit") ) {
                System.out.println("📷 필터 부스를 종료합니다. 안녕히 가세요!");
                System.exit(0);
            } else if (!map.containsKey(filter)) {
                System.out.println("⚠\uFE0F 존재하지 않는 필터입니다. 다시 입력해주세요.");
            } else {
                System.out.print(">> 사진 입력: ");
                String photo = scanner.nextLine();


                System.out.println("[사용 필터: " + filter + "] => " + map.get(filter)
                        .apply(photo));
                System.out.println();
            }

        }

//        FilterStrategy f1 = new SmoothSkinFilter();
//        System.out.println(f1.apply("My Face")); // "my face✨"
//
//        FilterStrategy f2 = new CuteEyesFilter();
//        System.out.println(f2.apply("Beautiful")); // "B👁👁t👁f👁l"
//
//        FilterStrategy f3 = new KawaiiFilter();
//        System.out.println(f3.apply("Lovely")); // "ylevoL🌸"
    }
}