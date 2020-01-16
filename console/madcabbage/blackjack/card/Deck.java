package console.madcabbage.blackjack.card;

import console.madcabbage.blackjack.card.Card;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

    private List<Card> deck;
    private DeckType type;

    public Deck() {
        deck = new ArrayList<Card>();
        populate();
        shuffle();
    }

    public void clear() {
        deck.clear();
    }

    private void populate() {
        for (Face face : Face.values()) {
            for (Suit suit : Suit.values()) {
                for (Color color : Color.values()) {
                    deck.add(new Card(suit, face, color));
                }
            }
        }
    }

    public void rePopulate() {
        deck.clear();
        populate();
        shuffle();
    }

    public void shuffle() {
        Random rand = new Random();
        int bound = deck.size() - 1;
        for(int i = 0; i < 750; i++) {
            int a = rand.nextInt(bound), b = rand.nextInt(bound);
            Card one = deck.get(a), two = deck.get(b);
            deck.set(a, two); deck.set(b, one);
        }
    }

    public Card drawCard() {
        Card top = deck.get(deck.size() - 1);
        deck.remove(top);
        return top;
    }

    public void cut(int position) {
        List<Card> topHalf = new ArrayList<>(), botHalf = new ArrayList<>();
        for (int i = 0; i < deck.size() - 1; i++) {
            if (i < position) {
                botHalf.add(deck.get(i));
            } else {
                topHalf.add(deck.get(i));
            }
        }
        clear();
        deck.addAll(topHalf);
        deck.addAll(botHalf);
    }

}
