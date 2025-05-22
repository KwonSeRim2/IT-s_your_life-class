package builder.builder2;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .name("홍길동")
                .email("hong@scoula.org")
                .password("123456")
                .phone("010-1111-2222")
                .address("서울시")
                .sex(true)
                .build();

        System.out.println(user);
    }
}
