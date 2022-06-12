package com.game.blackjack.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.game.blackjack.state.Finished.*;
import static org.junit.jupiter.api.Assertions.*;

public class BustTest {
    private Bust bust;
    @BeforeEach
    void init(){
        bust = new Bust();
    }
    @Test
    void 버스트는_21점을_넘기는_경우(){
        assertTrue(bust.isRightState(POINT_OF_BUST));
        assertFalse(bust.isRightState(POINT_OF_BLACKJACK));
    }
    @Test
    void 버스트는_배율이_0배이다(){
        assertEquals(bust.earningRate(POINT_OF_BUST).get(),RATE_OF_BUST);
        assertTrue(bust.earningRate(POINT_OF_BLACKJACK).isEmpty());
    }
}
