package com.game.blackjack.card;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {
    @Test
    void makeCard(){
        Card card = new Card(Pattern.CLOVER,Symbol.ACE);
    }

}