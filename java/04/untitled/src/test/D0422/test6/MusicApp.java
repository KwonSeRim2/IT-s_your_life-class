package test.D0422.test6;

public class MusicApp {
    private String user = "yura";


    public static class PlayerUI {

        public void show(MusicApp m) {
            System.out.println("🎧 현재 사용자: " + m.user); // ❌ 컴파일 에러 발생
        }
    }

    public static void main(String[] args) {
        MusicApp m =new MusicApp();
        MusicApp.PlayerUI ui = new MusicApp.PlayerUI();
        ui.show(m);
    }
}
