package com.game.blackjack.card;

public class Card {
    private final Symbol symbol;
    private final Pattern pattern;

    public Card(Pattern pattern, Symbol symbol) {
        this.pattern = pattern;
        this.symbol = symbol;
    }

    public int  getPoint(){
        return symbol.getPoint();
    }
}

