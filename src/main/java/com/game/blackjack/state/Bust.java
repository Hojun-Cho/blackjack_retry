package com.game.blackjack.state;

import static com.game.blackjack.state.BlackJack.POINT_OF_BLACKJACK;
import static com.game.blackjack.state.BlackJack.RATE_OF_NOTHING;

public class Bust {
    private static final BattingRate RATE_OF_BUST = new BattingRate(0);

    public boolean isRightState(GamePoint point) {
        return point.isOver(POINT_OF_BLACKJACK);
    }

    public BattingRate earningRate(GamePoint point) {
        if (isRightState(point))
            return RATE_OF_BUST;
        return RATE_OF_NOTHING;
    }
}
