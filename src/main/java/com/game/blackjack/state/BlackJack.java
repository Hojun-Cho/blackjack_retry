package com.game.blackjack.state;

import java.util.Optional;

public class BlackJack {
    public static final GamePoint POINT_OF_BLACKJACK = new GamePoint(21);
    private static final BattingRate RATE_OF_BLACKJACK = new BattingRate(1.5);

    public boolean isRightState(GamePoint point) {
        return point.equals(POINT_OF_BLACKJACK);
    }

    public Optional<BattingRate> earningRate(GamePoint point) {
        if(isRightState(point))
            return Optional.of(RATE_OF_BLACKJACK);
        return Optional.empty();
    }
}
