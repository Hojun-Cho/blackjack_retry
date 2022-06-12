package com.game.blackjack.card;

import java.util.*;

public class CardDeck {
    public static final int SIZE_OF_DECK = 52;
    private final Queue<Card> deck = new ArrayDeque<>(SIZE_OF_DECK);

    public CardDeck() {
        Arrays.stream(Pattern.values())
                .forEach(pattern -> Arrays.stream(Symbol.values())
                        .forEach(symbol -> deck.add(new Card(pattern,symbol))));
    }

    public Optional<Card> draw() {
        if (deck.isEmpty())
            return Optional.empty();
        return Optional.of(deck.poll());
    }

    public int getLastCardsCount() {
        return deck.size();
    }
}
