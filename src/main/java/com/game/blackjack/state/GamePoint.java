package com.game.blackjack.state;

public class GamePoint {
    private final int point;
    public GamePoint(int point) {
        this.point = point;
    }

    @Override
    public boolean equals(Object obj) {
        return ((GamePoint)obj).point == this.point;
    }
}
