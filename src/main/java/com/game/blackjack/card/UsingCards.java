package com.game.blackjack.card;

import com.game.blackjack.common.GamePoint;

import java.util.List;

public interface UsingCards {
    void add(Card card);

    void addAll(List<Card> cards);

    GamePoint calculatePoint();
}
