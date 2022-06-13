package com.game.blackjack.state;

import com.game.blackjack.common.GamePoint;

public interface Running extends State {

    boolean isOkayDraw(GamePoint point);

    @Override
    default boolean isRightState(GamePoint point) {
        return !isFinished(point);
    }

    boolean isFinished(GamePoint point);

    Finished getFinishedState(GamePoint point);


}
