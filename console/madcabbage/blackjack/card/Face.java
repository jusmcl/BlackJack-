package console.madcabbage.blackjack.card;

public enum Face {

    JOKER(10, "Joker"), ACE(1, "Ace"), TWO(2, "Two"),
    THREE(3, "Three"), FOUR(4, "Four"), FIVE(5, "Five"),
    SIX(6, "Six"), SEVEN(7, "Seven"), EIGHT(8, "Eight"),
    NINE(9, "Nine"), TEN(10, "Ten"), JACK(10, "Jack"),
    QUEEN(10, "Queen"), KING(10, "King"), HIGH_ACE(11, ACE.face);

    private final int value;
    private final String face;

    private Face(int value, String face) {
        this.value = value;
        this.face = face;
    }

    @Override
    public String toString() {
        return this.face;
    }

    public int getValue() {
        return this.value;
    }

}
