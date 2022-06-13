package com.game.blackjack.gamer;

import com.game.blackjack.card.Card;
import com.game.blackjack.card.UsingCards;
import com.game.blackjack.common.BattingRate;
import com.game.blackjack.common.Cash;
import com.game.blackjack.common.GamePoint;

import java.util.List;

public class Player {
    private UsingCards cards = new UsingCards();
    private final Cash cash;

    public Player(Cash cash) {
        this.cash = new Cash(cash);
    }

    public void drawCard(Card card) {
        cards.add(card);
    }

    public void drawCardList(List<Card> card) {
        cards.addAll(card);
    }

    public GamePoint getPoint() {
        return cards.calculatePoint();
    }

    public Cash multiplication(BattingRate rate) {
        return cash.multiplication(rate);
    }
}
