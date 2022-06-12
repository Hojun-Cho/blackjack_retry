package com.game.blackjack.state;

import java.util.Optional;

public interface Finished {
    GamePoint POINT_OF_BLACKJACK = new GamePoint(21);
    GamePoint POINT_OF_BUST = new GamePoint(22);
    GamePoint POINT_OF_STAY = new GamePoint(20);

    BattingRate RATE_OF_BLACKJACK = new BattingRate(1.5);
    BattingRate RATE_OF_STAY = new BattingRate(1);
    BattingRate RATE_OF_BUST = new BattingRate(0);

    boolean isRightState(GamePoint point);

    Optional<BattingRate> earningRate(GamePoint point);
}