package test.D0422.test3;

public class GenrePlaybackManager {
    public interface GenrePlayer {
        void play(String title, String artist);
    }

    private GenrePlayer genrePlayer;

    public void setPlayer(GenrePlayer player){
        this.genrePlayer = player;
    }  // 전략 주입
    public void play(String title, String artist){
        this.genrePlayer.play(title, artist);
    }  // 전략에 따른 재생 실행
}
