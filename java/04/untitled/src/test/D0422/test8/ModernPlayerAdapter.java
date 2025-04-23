package test.D0422.test8;

public class ModernPlayerAdapter implements Playable{
    private ModernPlayer modernPlayer;

    public ModernPlayerAdapter(ModernPlayer modernPlayer) {
        this.modernPlayer = modernPlayer;
    }

    @Override
    public void play(String title) {
        if(title.toLowerCase().contains("bad")){
            System.out.println("금지어가 포함된 곡은 재생할 수 없습니다: "+title);
        }else {
            modernPlayer.begin(title);

        }
    }
}
