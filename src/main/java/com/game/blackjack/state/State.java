package com.game.blackjack.state;

import com.game.blackjack.common.GamePoint;

public interface State {
    boolean isRightState(GamePoint point);
}
