package com.game.blackjack.state;

import com.game.blackjack.card.UsingCards;
import com.game.blackjack.common.BattingRate;
import com.game.blackjack.common.GamePoint;

import java.util.Optional;

public class BlackJack implements Finished{

    public boolean isRightState(GamePoint point) {
        return point.equals(POINT_OF_BLACKJACK);
    }

    public Optional<BattingRate> earningRate(GamePoint point) {
        if(isRightState(point))
            return Optional.of(RATE_OF_BLACKJACK);
        return Optional.empty();
    }
}
