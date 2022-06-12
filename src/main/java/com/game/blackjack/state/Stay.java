package com.game.blackjack.state;

import com.game.blackjack.common.BattingRate;
import com.game.blackjack.common.GamePoint;

import java.util.Optional;

public class Stay implements Finished{
    public boolean isRightState(GamePoint point) {
        return   !point.isOver(POINT_OF_STAY);
    }
    public Optional<BattingRate> earningRate(GamePoint point){
        if(isRightState(point))
            return Optional.of(RATE_OF_STAY);
        return Optional.empty();
    }
}
