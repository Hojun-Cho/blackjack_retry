package com.game.blackjack.common;

public class GamePoint implements Comparable{
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
    public GamePoint add(GamePoint point) {
        return new GamePoint(this.point + point.point);
    }
    @Override
    public boolean equals(Object obj) {
        return ((GamePoint) obj).point == this.point;
    }

    @Override
    public int compareTo(Object o) {
        GamePoint target = (GamePoint) o;
        if(this.equals(target)){
            return 0;
        }
        if(this.isOver(target)){
            return 1;
        }
        return -1;
    }


}
