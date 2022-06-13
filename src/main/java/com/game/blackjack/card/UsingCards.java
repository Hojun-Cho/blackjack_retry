package com.game.blackjack.card;

import com.game.blackjack.common.GamePoint;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static com.game.blackjack.state.Finished.POINT_OF_ACE_HIGH;
import static com.game.blackjack.state.Finished.POINT_OF_BLACKJACK;

public class UsingCards {
    private final List<Card> cards = new ArrayList<>();

    public void add(Card card) {
        cards.add(card);
    }
    public void addAll(List<Card> cards){
        this.cards.addAll(cards);
    }
    public GamePoint getPoint() {
        return new GamePoint(cards.stream().sorted(Comparator.comparing(Card::getPoint).reversed())
                .map(card -> card.getPoint())
                .reduce(0, (acc, point) -> acc + determineAddPoint(acc, point)));

    }
    private int determineAddPoint(int acc, int point){
        if(Symbol.ACE.isSamePoint(point)){
            return determineAcePoint(acc);
        }
        return point;
    }
    private int determineAcePoint(int acc){
        GamePoint total = new GamePoint(acc);
        if(total.isSameOrOver(POINT_OF_BLACKJACK) || total.add(POINT_OF_ACE_HIGH).isOver(POINT_OF_BLACKJACK) )
            return 1;
        return 11;
    }
}

