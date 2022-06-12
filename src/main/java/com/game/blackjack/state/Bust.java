package com.game.blackjack.state;


import java.util.Optional;

public class Bust {
    private static final BattingRate RATE_OF_BUST = new BattingRate(0);
    public static final GamePoint POINT_OF_BUST = new GamePoint(22);

    public boolean isRightState(GamePoint point) {
        return point.isSameOrOver(POINT_OF_BUST);
    }

    public Optional<BattingRate> earningRate(GamePoint point) {
        if (isRightState(point))
            return Optional.of(RATE_OF_BUST);
        return Optional.empty();
    }
}
