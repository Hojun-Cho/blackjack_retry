package com.game.blackjack.state;


import com.game.blackjack.card.UsingCards;
import com.game.blackjack.common.BattingRate;
import com.game.blackjack.common.GamePoint;

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
