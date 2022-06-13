package com.game.blackjack.common;

public class BattingRate  {
    private final double rate;
    public BattingRate(double rate) {
        this.rate = rate;
    }
    public double getRate(){
        return rate;
    }

    @Override
    public boolean equals(Object obj) {
        return ((BattingRate)obj).rate == this.rate;
    }
}
