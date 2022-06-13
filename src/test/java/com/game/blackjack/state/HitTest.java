package com.game.blackjack.state;

import com.game.blackjack.card.Card;
import com.game.blackjack.card.Pattern;
import com.game.blackjack.card.Symbol;
import com.game.blackjack.card.UsingCards;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class HitTest {
    UsingCards cards;
    Hit hit;
    @BeforeEach
    void init(){
        cards = new UsingCards();
        hit = new Hit();
    }
    @Test
    void 플레이어가_2장을_뽑고_더_뽑는게_가능(){
        cards.addAll(List.of(new Card(Pattern.DIAMOND, Symbol.QUEEN),new Card(Pattern.CLOVER,Symbol.QUEEN)));
        assertTrue(hit.isOkayDraw(cards));
    }
    @Test
    void 플레이어가_2장을_뽑고_더_뽑는게_불가능(){
        cards.addAll(List.of(new Card(Pattern.DIAMOND, Symbol.QUEEN),new Card(Pattern.CLOVER,Symbol.ACE)));
        assertFalse(hit.isOkayDraw(cards));
    }

}
