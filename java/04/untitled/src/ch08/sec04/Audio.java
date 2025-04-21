package ch08.sec04;


public class Audio implements RemoteControl {

    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio응 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > ch08.sec04.RemoteControl.MAX_VOLUME) {
            this.volume = ch08.sec04.RemoteControl.MAX_VOLUME;
        }else if (volume< ch08.sec04.RemoteControl.MIN_VOLUME){
            this.volume = MIN_VOLUME;
        }else {
            this.volume = volume;
        }
        System.out.println("현재 Audio볼륨"+this.volume);
    }
}
