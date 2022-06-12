package com.game.blackjack.state;

import com.game.blackjack.common.BattingRate;
import com.game.blackjack.common.GamePoint;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.game.blackjack.state.Finished.POINT_OF_BUST;
import static com.game.blackjack.state.Finished.POINT_OF_STAY;
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
        assertTrue(blackJack.isRightState(new GamePoint(BLACKJACK)));
        assertFalse(blackJack.isRightState(new GamePoint(20)));
    }
    @Test
    void 블랙잭이면_1_5배의_배율을_받는다(){
        assertEquals(blackJack.earningRate(new GamePoint(BLACKJACK)).get(),new BattingRate(1.5));
        assertTrue(blackJack.earningRate(POINT_OF_STAY).isEmpty());
        assertTrue(blackJack.earningRate(POINT_OF_BUST).isEmpty());

    }
}
