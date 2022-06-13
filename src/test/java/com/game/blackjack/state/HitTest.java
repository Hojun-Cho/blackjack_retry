package com.game.blackjack.state;

import com.game.blackjack.common.GamePoint;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.game.blackjack.AppConfig.running;
import static com.game.blackjack.state.Finished.*;
import static org.junit.jupiter.api.Assertions.*;


public class HitTest {
    Running hit;
    @BeforeEach
    void init(){
        hit = running();
    }

    @Test
    void 플레이어가_2장을_뽑고_더_뽑는게_가능(){
        assertTrue(hit.isOkayDraw(new GamePoint(20)));
    }
    @Test
    void 플레이어가_2장을_뽑고_더_뽑는게_불가능(){
        assertFalse(hit.isOkayDraw(POINT_OF_BLACKJACK));
        assertFalse(hit.isOkayDraw(POINT_OF_BUST));
    }
    @Test
    void _21점과_같거나_크다면_finished이다(){
        assertTrue(hit.isFinished(new GamePoint(21)));
        assertTrue(hit.isFinished(new GamePoint(22)));

        assertFalse(hit.isFinished(new GamePoint(20)));
    }

}
