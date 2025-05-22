package streategy;

import java.util.Random;

public class WinningStrategy implements Strategy {
    private Random random;
    private boolean won = false;
    private Hand prevHand;

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }


    @Override
    public Hand nextHand() {
        if (!won) {
            prevHand = Hand.getHands(random.nextInt());
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
