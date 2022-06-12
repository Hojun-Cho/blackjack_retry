package com.game.blackjack.state;


import java.util.Optional;

public class Bust implements Finished {

    public boolean isRightState(GamePoint point) {
        return point.isSameOrOver(POINT_OF_BUST);
    }

    public Optional<BattingRate> earningRate(GamePoint point) {
        if (isRightState(point))
            return Optional.of(RATE_OF_BUST);
        return Optional.empty();
    }
}
