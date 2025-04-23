package test.D0422.test4;

public class PlayerUI {
    public interface ClickListener {
        void onClick();
    }

    private ClickListener clickListener;

    void setClickListener(ClickListener listener){
        clickListener = listener;
    }
    void clickPlayButton(){
        if(clickListener == null){
            System.out.println("❌ 리스너가 등록되지 않았습니다.");
        }
        clickListener.onClick();

    }

}
