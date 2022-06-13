package com.game.blackjack.state;

import com.game.blackjack.common.BattingRate;
import com.game.blackjack.common.GamePoint;

import java.util.Optional;

public interface Finished extends State {
    GamePoint POINT_OF_BLACKJACK = new GamePoint(21);
    GamePoint POINT_OF_BUST = new GamePoint(22);
    GamePoint POINT_OF_STAY = new GamePoint(20);
    GamePoint POINT_OF_ACE_HIGH = new GamePoint(11);

    BattingRate RATE_OF_BLACKJACK = new BattingRate(1.5);
    BattingRate RATE_OF_STAY = new BattingRate(1);
    BattingRate RATE_OF_BUST = new BattingRate(0);

    Optional<BattingRate> earningRate(GamePoint point);
}
