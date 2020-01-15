package console.madcabbage.blackjack.card;

import console.madcabbage.blackjack.card.Card;

import java.util.List;

public class Deck {

    private List<Card> deck, discarded, dealt;
    private DeckType type;

    public Deck(DeckType type) {
        populate(type);
    }

    private void populate(DeckType type) {

        for (Face face : Face.values()) {
            for (Suit suit : Suit.values()) {
                for (Color color : Color.values()) {
                    deck.add(new Card(suit, face, color));
                }
            }
        }

    }

    public void shuffle() {

    }

    public Card getCard() {
        Card top = deck.get(deck.size() - 1);
        dealt.add(top);
        deck.remove(top);
        return top;
    }


}
