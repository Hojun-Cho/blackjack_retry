package com.game.blackjack.card;

import com.game.blackjack.common.GamePoint;

public enum Symbol {
    ACE("a", 1),
    TWO("2", 2),
    THREE("3", 3),
    FOUR("4", 4),
    FIVE("5", 5),
    SIX("6", 6),
    SEVEN("7", 7),
    EIGHT("8", 8),
    NINE("9", 9),
    TEN("10", 10),
    JUMP("j", 10),
    KING("k", 10),
    QUEEN("q", 10);

    private final String mark;
    private final int point;

    Symbol(String mark, int point) {
        this.mark = mark;
        this.point = point;
    }

    public String getMark() {
        return mark;
    }

    public int getPoint() {
        return point;
    }
    public boolean isSamePoint(int point){
       return this.point == point;
    }
}
