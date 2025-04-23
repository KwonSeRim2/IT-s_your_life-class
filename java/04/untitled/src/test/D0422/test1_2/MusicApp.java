package test.D0422.test1_2;

public class MusicApp {
    String ef;
    String t;
    String s;
    String g;

    public MusicApp(String t, String s, String g) {
        this.t = t;
        this.s = s;
        this.g = g;
    }

    class MusicPlayer {
        void play() {
            if(g == "HIPHOP"){
                ef = "💥";
            }else if(g == "BALLAD"){
                ef = "🎵";
            }else{
                ef = "🎧";
            }
            System.out.println(ef+t+" - "+s+"을(를) 재생합니다."+ef);
        }
    }
}
