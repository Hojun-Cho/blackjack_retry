package com.game.blackjack.state;

import com.game.blackjack.card.UsingCards;
import com.game.blackjack.common.GamePoint;

import static com.game.blackjack.state.Finished.*;

public class Hit implements  State {

    public boolean isOkayDraw(UsingCards cards) {
        return isRightState(cards.getPoint());
    }

    @Override
    public boolean isRightState(GamePoint point) {
        return !point.isSameOrOver(POINT_OF_BLACKJACK);
    }

    static Finished getState(GamePoint point) {
        if (point.equals(POINT_OF_BLACKJACK)) {
            return new BlackJack();
        }
        if (point.isSameOrOver(POINT_OF_BUST)) {
            return new Bust();
        }
        if (!point.isOver(POINT_OF_STAY)) {
            return new Stay();
        }
        throw new IllegalArgumentException();
    }

}
