package com.game.blackjack.gamer;

import com.game.blackjack.card.Card;
import com.game.blackjack.common.BattingRate;
import com.game.blackjack.common.Cash;
import com.game.blackjack.common.GamePoint;

import java.util.List;

public interface Player {
    void drawCard(Card card);

    void drawCardList(List<Card> card);

    GamePoint getPoint();

    Cash multiplication(BattingRate rate);
}
