package com.game.blackjack.state;

public class BlackJack {
    private static final int POINT_OF_BLACKJACK = 21;
    private static final double RATE_OF_BLACKJACK = 1.5;
    public static final int RATE_OF_NOTHING = 1;

    public boolean isThisRightState(GamePoint point) {
        return point.equals(new GamePoint(POINT_OF_BLACKJACK));
    }

    public BattingRate earningRate(GamePoint point) {
        if(isThisRightState(point))
            return new BattingRate(RATE_OF_BLACKJACK);
        return new BattingRate(RATE_OF_NOTHING);
    }
}
