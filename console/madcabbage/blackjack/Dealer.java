package console.madcabbage.blackjack;

import console.madcabbage.blackjack.card.Card;
import console.madcabbage.blackjack.card.Deck;
import console.madcabbage.blackjack.card.Hand;

import java.util.ArrayList;
import java.util.List;

public class Dealer {

    private Deck deck;
    private Hand hand;

    public Dealer(Deck deck) {
        this.deck = deck;
        this.hand = new Hand();
    }

    public Card hit() {
        return deck.drawCard();
    }

    public void giveCard(Card card) {
        hand.add(card);
    }

    public void showHand() {
        this.hand.show("Dealer");
    }

}
