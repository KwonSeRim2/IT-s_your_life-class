package streategy;

public enum Hand {
    ROCK("바위", 0),
    SCISSORS("가위", 1),
    PAPER("보", 2);

    private String name; //손의 이름
    private int handvalue; //손의 값

    Hand(String name, int handvalue) {
        this.name = name;
        this.handvalue = handvalue;
    }

    private static Hand[] hands = {
            ROCK, SCISSORS, PAPER
    };

    public static Hand getHands(int handvalue) {
        return hands[handvalue];
    }

    private int fight(Hand h) {
        if (this == h) {
            return 0; //무승부
        } else if ((this.handvalue + 1) % 3 == h.handvalue) {
            return 1; //this가 이기는 겨우
        } else {
            return -1; //상태가 이기는 경우
        }
    }

    //this가 상태방 보다 강한지 여부
    public boolean inStrongerThan(Hand h) {
        return fight(h) == 1;
    }

    //this가 생태보다 약한지
    public boolean isWeakerThan(Hand h) {
        return fight(h) == -1;
    }

    //손의 이름 반환
    @Override
    public String toString() {
        return name;
    }
}
