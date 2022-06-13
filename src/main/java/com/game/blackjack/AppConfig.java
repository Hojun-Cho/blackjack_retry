package com.game.blackjack;

import com.game.blackjack.card.CardDeck;
import com.game.blackjack.card.CardDeckImpl;
import com.game.blackjack.card.UsingCards;
import com.game.blackjack.card.UsingCardsImpl;
import com.game.blackjack.common.Cash;
import com.game.blackjack.gamer.Player;
import com.game.blackjack.gamer.PlayerImpl;
import com.game.blackjack.state.Hit;
import com.game.blackjack.state.Running;

public class AppConfig {

    public static UsingCards usingCards(){
        return new UsingCardsImpl();
    }
    public static Player player(Cash cash){
        return new PlayerImpl(cash,usingCards());
    }
    public static  CardDeck cardDeck(){
        return new CardDeckImpl();
    }
    public static Running running(){
        return new Hit();
    }
}
