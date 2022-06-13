package com.game.blackjack.state;

import com.game.blackjack.common.GamePoint;

import static com.game.blackjack.state.Finished.*;

public class Hit implements State {

    public boolean isOkayDraw(GamePoint point) {
        return isRightState(point);
    }

    @Override
    public boolean isRightState(GamePoint point) {
        return !point.isSameOrOver(POINT_OF_BLACKJACK);
    }

    public boolean isFinished(GamePoint point) {
        return point.isSameOrOver(POINT_OF_BLACKJACK);
    }

    public Finished getFinishedState(GamePoint point) {
        if (point.equals(POINT_OF_BLACKJACK)) {
            return new BlackJack();
        }
        if (point.isSameOrOver(POINT_OF_BUST)) {
            return new Bust();
        }
        return new Stay();
    }

}
