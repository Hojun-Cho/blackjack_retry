package com.game.blackjack.state;

import java.util.Optional;

public class Stay {
    public static final GamePoint POINT_OF_STAY =new GamePoint(20);
    private static final BattingRate RATE_OF_STAY  = new BattingRate(1);
    public boolean isRightState(GamePoint point) {
        return   !point.isOver(POINT_OF_STAY);
    }
    public Optional<BattingRate> earningRate(GamePoint point){
        if(isRightState(point))
            return Optional.of(RATE_OF_STAY);
        return Optional.empty();
    }
}
