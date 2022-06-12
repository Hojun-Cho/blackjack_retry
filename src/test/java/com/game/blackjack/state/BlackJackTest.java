package com.game.blackjack.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class BlackJackTest {
    public static final int BLACKJACK = 21;
    private BlackJack blackJack ;
    @BeforeEach
    void init(){
        blackJack = new BlackJack();
    }
    @Test
    void 점수를_받아서_블랙잭인지_확인한다(){
        assertTrue(blackJack.isThisRightState(new GamePoint(BLACKJACK)));
        assertFalse(blackJack.isThisRightState(new GamePoint(20)));
    }
    @Test
    void 블랙잭이면_1_5배의_배율을_받는다(){
        assertEquals(blackJack.earningRate(new GamePoint(BLACKJACK)),new BattingRate(1.5));
        assertEquals(blackJack.earningRate(new GamePoint(20)),new BattingRate(1));
        assertEquals(blackJack.earningRate(new GamePoint(22)),new BattingRate(1));

    }
}
