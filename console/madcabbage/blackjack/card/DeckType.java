package console.madcabbage.blackjack.card;

public enum DeckType {

    STANDARD(52), JOKERS_2(54), JOKERS_4(56), DOUBLE_STANDARD(104);

    private final int cards;

    private DeckType(int numOfCards) {
        this.cards = numOfCards;
    }

    public int getCards() {
        return this.cards;
    }
}
