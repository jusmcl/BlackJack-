package console.madcabbage.blackjack;

import console.madcabbage.blackjack.card.Card;
import console.madcabbage.blackjack.card.Hand;

public class Player {

    private Hand hand;
    private String name;

    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Hand getHand() {
        return hand;
    }

    public Card getCard(int position) {
        return hand.getCard(position);
    }

    public void giveCard(Card card) {
        this.hand.add(card);
    }

    public void fold() {
        // give hand to dealer
        // clear hand
    }

    public void showHand() {
        this.hand.show(this.name);
    }
}
