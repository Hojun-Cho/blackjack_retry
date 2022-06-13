package com.game.blackjack.gamer;

import com.game.blackjack.AppConfig;
import com.game.blackjack.card.Card;
import com.game.blackjack.card.Pattern;
import com.game.blackjack.card.Symbol;
import com.game.blackjack.common.Cash;
import com.game.blackjack.common.GamePoint;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.game.blackjack.state.Finished.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class PlayerImplTest {
    private Player player;
    private final Cash startCash = new Cash(1000);

    @BeforeEach
    void init() {
        player = AppConfig.player(startCash);
    }

    @Test
    void 플레이어는_그냥_카드를_받는다() {
        player.drawCard(new Card(Pattern.DIAMOND, Symbol.QUEEN));
        player.drawCardList(List.of(new Card(Pattern.DIAMOND, Symbol.QUEEN), new Card(Pattern.CLOVER, Symbol.ACE)));

        assertEquals(player.getPoint(), POINT_OF_BLACKJACK);
    }

    @Test
    void 플레이어는_21점을_넘어도_카드를받는다() {
        player.drawCardList(List.of(new Card(Pattern.DIAMOND, Symbol.QUEEN),
                new Card(Pattern.CLOVER, Symbol.QUEEN), new Card(Pattern.CLOVER, Symbol.QUEEN)));

        assertEquals(player.getPoint(), new GamePoint(30));
    }

    @Test
    void 받아온cash에_battingRate를_곱한다() {
        assertEquals(player.multiplication(RATE_OF_BLACKJACK), new Cash(1500));
        assertEquals(player.multiplication(RATE_OF_STAY), new Cash(1000));
        assertEquals(player.multiplication(RATE_OF_BUST), new Cash(0));
    }
}
