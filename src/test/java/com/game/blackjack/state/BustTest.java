package com.game.blackjack.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BustTest {
    private Bust bust;
    @BeforeEach
    void init(){
        bust = new Bust();
    }
    @Test
    void 버스트는_21점을_넘기는_경우(){
        assertTrue(bust.isRightState(new GamePoint(22)));
        assertFalse(bust.isRightState(new GamePoint(21)));
    }
    @Test
    void 버스트는_배율이_0배이다(){
        assertEquals(bust.earningRate(new GamePoint(22)),new BattingRate(0));
        assertEquals(bust.earningRate(new GamePoint(21)),new BattingRate(1));
    }
}
