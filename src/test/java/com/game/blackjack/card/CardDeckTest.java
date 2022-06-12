package com.game.blackjack.card;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static com.game.blackjack.card.CardDeck.SIZE_OF_DECK;
import static org.junit.jupiter.api.Assertions.*;

public class CardDeckTest {
    CardDeck cardDeck;

    @BeforeEach
    void init() {
        cardDeck = new CardDeck();
    }

    @Test
    void makeCardDeck() {
        cardDeck.draw();
        assertEquals(cardDeck.getLastCardsCount(), SIZE_OF_DECK - 1);
    }

    @Test
    void 모든_카드를_다_뽑자() {
        IntStream.range(0, SIZE_OF_DECK).
                forEach(v -> assertTrue(cardDeck.draw().isPresent()));
        assertTrue(cardDeck.draw().isEmpty());
    }

}
