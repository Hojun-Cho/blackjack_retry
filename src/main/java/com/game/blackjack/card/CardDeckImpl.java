package com.game.blackjack.card;

import java.util.*;

public class CardDeckImpl implements CardDeck{
    private final Queue<Card> deck = new ArrayDeque<>(SIZE_OF_DECK);

    public CardDeckImpl() {
        Arrays.stream(Pattern.values())
                .forEach(pattern -> Arrays.stream(Symbol.values())
                        .forEach(symbol -> deck.add(new Card(pattern,symbol))));
    }

    public Optional<Card> draw() {
        if (deck.isEmpty())
            return Optional.empty();
        return Optional.of(deck.poll());
    }
}
