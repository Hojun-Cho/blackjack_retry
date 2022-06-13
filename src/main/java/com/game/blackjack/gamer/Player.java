package com.game.blackjack.gamer;

import com.game.blackjack.card.Card;
import com.game.blackjack.card.UsingCards;
import com.game.blackjack.common.GamePoint;

import java.util.List;

public class Player {
    private UsingCards cards = new UsingCards();
    public void drawCard(Card card) {
        cards.add(card);
    }
    public void drawCard(List<Card> card) {
        cards.addAll(card);
    }

    public GamePoint getPoint() {
        return cards.calculatePoint();
    }
}
