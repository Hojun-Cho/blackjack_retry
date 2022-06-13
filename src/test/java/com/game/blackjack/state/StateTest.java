package com.game.blackjack.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.game.blackjack.AppConfig.running;
import static com.game.blackjack.state.Finished.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StateTest {
    private Running hit ;
    @BeforeEach
    void init(){
        hit = running();
    }
    @Test
    void 점수에_따라서_인스턴스를_생성한다(){
         assertTrue(  hit.getFinishedState(POINT_OF_BLACKJACK) instanceof BlackJack);
        assertTrue( hit.getFinishedState(POINT_OF_BUST) instanceof Bust);
        assertTrue( hit.getFinishedState(POINT_OF_STAY) instanceof Stay);
    }
}
