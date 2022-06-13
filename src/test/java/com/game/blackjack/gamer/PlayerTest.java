package com.game.blackjack.gamer;

import com.game.blackjack.card.Card;
import com.game.blackjack.card.Pattern;
import com.game.blackjack.card.Symbol;
import com.game.blackjack.common.GamePoint;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.game.blackjack.state.Finished.POINT_OF_BLACKJACK;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class PlayerTest {
    private Player player;
    @BeforeEach
    void init(){
        player = new Player();
    }
    @Test
    void 플레이어는_그냥_카드를_받는다(){
        player.drawCard(new Card(Pattern.DIAMOND, Symbol.QUEEN));
        player.drawCard(List.of(new Card(Pattern.DIAMOND,Symbol.QUEEN),new Card(Pattern.CLOVER,Symbol.ACE)));

        assertEquals(player.getPoint(),POINT_OF_BLACKJACK);
    }
    @Test
    void 플레이어는_21점을_넘어도_카드를받는다(){
        player.drawCard(List.of(new Card(Pattern.DIAMOND,Symbol.QUEEN),
                new Card(Pattern.CLOVER,Symbol.QUEEN),new Card(Pattern.CLOVER,Symbol.QUEEN)));

        assertEquals(player.getPoint(),new GamePoint(30));
    }
    @Test
    void 플레이어에게_받아온_cards에_카드를추가할_수_없다(){

    }
}
