package com.game.blackjack.card;

public enum Pattern {
    Spade("spade"),
    HEART("heart"),
    DIAMOND("diamond"),
    CLOVER("clover");

    private final String pattern;

    Pattern(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }
}