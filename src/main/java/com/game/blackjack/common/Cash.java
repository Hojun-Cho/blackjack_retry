package com.game.blackjack.common;

public class Cash {
    private final double now;

    public Cash(Cash cash) {
        this.now = cash.now;
    }

    public Cash(double cash) {
        this.now = cash;
    }

    public Cash multiplication(BattingRate rate) {
        return new Cash(this.now * rate.getRate());
    }

    @Override
    public boolean equals(Object obj) {
        return ((Cash) obj).now == this.now;
    }
}
