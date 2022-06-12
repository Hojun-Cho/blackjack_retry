package com.game.blackjack.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.game.blackjack.state.Finished.*;
import static org.junit.jupiter.api.Assertions.*;

public class StayTest {
    private Stay stay;
    @BeforeEach
    void init(){
        stay = new Stay();
    }
    @Test
    void 블랙잭_혹은_버스트인경우_stay에_머무를_수_없다(){
        assertFalse(stay.isRightState(POINT_OF_BLACKJACK));
        assertFalse(stay.isRightState(POINT_OF_BUST));
        assertTrue(stay.isRightState(POINT_OF_STAY));
    }
    @Test
    void Stay상태인경우_1배의_배율을_받는다(){
        assertEquals(stay.earningRate(POINT_OF_STAY).get(),RATE_OF_STAY);
        assertTrue(stay.earningRate(POINT_OF_BUST).isEmpty());
        assertTrue(stay.earningRate(POINT_OF_BLACKJACK).isEmpty());

    }


}
