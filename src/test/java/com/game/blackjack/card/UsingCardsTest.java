package com.game.blackjack.card;

import com.game.blackjack.common.GamePoint;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.game.blackjack.state.Finished.POINT_OF_BLACKJACK;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsingCardsTest {
    private UsingCards cards ;
    @BeforeEach
    private void  init(){
        cards = new UsingCards();
    }
    @Test
    void BALCKJACK_을_맞추는경우() {
        cards.add(new Card(Pattern.DIAMOND, Symbol.ACE));
        assertEquals(cards.calculatePoint(), new GamePoint(11));

        cards.add(new Card(Pattern.DIAMOND,Symbol.QUEEN));
        assertEquals(cards.calculatePoint(), POINT_OF_BLACKJACK);

        cards.add(new Card(Pattern.DIAMOND,Symbol.QUEEN));
        assertEquals(cards.calculatePoint(), POINT_OF_BLACKJACK);
    }
    @Test
    void ACE_를_11점으로_계산하면_GAME_OVER되는경우_1점으로_계산(){
        cards.add(new Card(Pattern.DIAMOND, Symbol.ACE));
        cards.add(new Card(Pattern.DIAMOND,Symbol.FIVE));
        cards.add(new Card(Pattern.DIAMOND,Symbol.SIX));

        assertEquals(cards.calculatePoint(), new GamePoint(12));
    }
    @Test
    void 정렬_테스트(){
        cards.add(new Card(Pattern.DIAMOND,Symbol.FIVE));
        cards.add(new Card(Pattern.DIAMOND,Symbol.SIX));
        cards.add(new Card(Pattern.DIAMOND, Symbol.ACE));

        assertEquals(cards.calculatePoint(), new GamePoint(12));
    }
}
