package test.D0422.test6;

public class PlaybackManager {
    public interface Player {
        void play();
    }

    public void start() {
        int count = 0;

        class Logger implements Player {
            int count;

            public Logger(int count) {
                this.count = count;
            }

            public void play() {
                count++; // ❌ 컴파일 에러 발생
                System.out.println("🎶 재생 횟수: " + count);
            }
        }

        Logger logger = new Logger(count);
        logger.play();
        logger.play();
    }

    public static void main(String[] args) {
        new PlaybackManager().start();
    }
}
