package com.game.blackjack.card;

import java.util.Optional;

public interface CardDeck {
    int SIZE_OF_DECK = 52;

     Optional<Card> draw();


}
