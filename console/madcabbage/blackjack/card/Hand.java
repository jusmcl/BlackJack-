package console.madcabbage.blackjack.card;

import java.util.ArrayList;
import java.util.List;

public class Hand {

    private List<Card> hand;

    public Hand() {
        hand = new ArrayList<Card>();
    }

    public void clear() {
        hand.clear();
    }

    public void add(Card toAdd) {
        hand.add(toAdd);
    }

    public void insert(int position, Card cardToInsert) {
        hand.add(position, cardToInsert);
    }

    public void remove(Card cardToRemove) {
        hand.remove(cardToRemove);
    }

    public void remove(int positionOfCardToRemove) {
        hand.remove(positionOfCardToRemove);
    }

    public void swap(Card c1, Card c2) {
        //ensure hand contains the specified cards
        if (hand.contains(c1) && hand.contains(c2)) {
            //store the position of each card in the hand
            int c1p = hand.indexOf(c1), c2p = hand.indexOf(c2);
            //swap the position of the cards
            hand.set(c1p, c2); hand.set(c2p, c1);
        }
    }

    public void replace(Card replacee, Card replacer) {
        if (hand.contains(replacee)) {
            hand.set(hand.indexOf(replacee), replacer);
        }
    }

    public void replace(int replaceePos, Card replacer) {
        hand.set(replaceePos, replacer);
    }

    public Card getCard(int positionInHand) {
        return hand.get(positionInHand);
    }

    public void sort() {
        //higest face to lowest face
        //highest suit to lowest suit
    }

    public void show(String nameOfHandHolder) {
        System.out.println(nameOfHandHolder + "'s Hand:\n");
        for (Card card : this.hand) {
            System.out.println(card.getName());
        }
    }

}
