package console.madcabbage.blackjack.card;

public enum Suit {

    SPADES("Spades"), HEARTS("Hearts"), CLUBS("Clubs"), DIAMONDS("Diamonds");

    private final String suit;

    private Suit(String suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return this.suit;
    }
}
