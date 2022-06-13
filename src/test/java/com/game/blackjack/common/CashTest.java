package com.game.blackjack.common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashTest {
    @Test
    void cash는_BattingRate_를_곱한_금액을_돌려준다() {
        assertEquals(new Cash(1000).multiplication(new BattingRate(1.5)), new Cash(1500));
    }

}