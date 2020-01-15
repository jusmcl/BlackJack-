package console.madcabbage.blackjack.card;

public enum Color {

    RED("Red"), BLACK("Black");

    private final String color;

    private Color(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}
