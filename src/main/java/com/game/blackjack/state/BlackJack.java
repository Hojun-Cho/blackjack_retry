package com.game.blackjack.state;

public class BlackJack {
    public static final GamePoint POINT_OF_BLACKJACK = new GamePoint(21);
    private static final BattingRate RATE_OF_BLACKJACK = new BattingRate(1.5);
    public static final BattingRate RATE_OF_NOTHING = new BattingRate(1);

    public boolean isRightState(GamePoint point) {
        return point.equals(POINT_OF_BLACKJACK);
    }

    public BattingRate earningRate(GamePoint point) {
        if(isRightState(point))
            return RATE_OF_BLACKJACK;
        return RATE_OF_NOTHING;
    }
}
