package com.game.blackjack.common;

public class GamePoint {
    private final int point;

    public GamePoint(int point) {
        this.point = point;
    }

    public boolean isSameOrOver(GamePoint target) {
        return this.point >= target.point;
    }
    public  boolean isOver(GamePoint target){
        return this.point > target.point;
    }
    @Override
    public boolean equals(Object obj) {
        return ((GamePoint) obj).point == this.point;
    }
}
