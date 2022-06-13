package com.game.blackjack.card;

import com.game.blackjack.common.GamePoint;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static com.game.blackjack.state.Finished.POINT_OF_ACE_HIGH;
import static com.game.blackjack.state.Finished.POINT_OF_BLACKJACK;

public class UsingCards {
    protected static final int POINT_LOW_ACE = 1;
    protected static final int POINT_HIGH_ACE = 11;

    private final List<Card> cards ;
    public UsingCards(){
        cards = new ArrayList<>();
    }
    public UsingCards(UsingCards input) {
        this.cards = new ArrayList<>(input.cards);
    }

    public void add(Card card) {
        cards.add(card);
    }

    public void addAll(List<Card> cards) {
        this.cards.addAll(cards);
    }

    public GamePoint calculatePoint() {
        return new GamePoint(cards.stream().sorted(Comparator.comparing(Card::getPoint).reversed())
                .map(card -> card.getPoint())
                .reduce(0, (acc, point) -> acc + determineAddPoint(acc, point)));

    }

    private int determineAddPoint(int acc, int point) {
        if (Symbol.ACE.isSamePoint(point)) {
            return determineAcePoint(acc);
        }
        return point;
    }

    private int determineAcePoint(int acc) {
        GamePoint total = new GamePoint(acc);
        if (total.isSameOrOver(POINT_OF_BLACKJACK) || total.add(POINT_OF_ACE_HIGH).isOver(POINT_OF_BLACKJACK))
            return POINT_LOW_ACE;
        return POINT_HIGH_ACE;
    }
}

