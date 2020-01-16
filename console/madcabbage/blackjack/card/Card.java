package console.madcabbage.blackjack.card;

public class Card {

    private String name;
    private Suit suit;
    private Face face;
    private Color color;
    private boolean isFaceUp;

    public Card(Suit suit, Face face, Color color) {
        this.name = color.toString() + " " + face.toString() + " of " + suit.toString();
        this.suit = suit;
        this.face = face;
        this.color = color;
        this.isFaceUp = false;
    }

    public String getName() {
        return name;
    }

    public Suit getSuit() {
        return suit;
    }

    private void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Face getFace() {
        return face;
    }

    private void setFace(Face face) {
        this.face = face;
    }

    public Color getColor() {
        return color;
    }

    private void setColor(Color color) {
        this.color = color;
    }

    // returns the orientation of the card
    public boolean isFaceUp() {
        return isFaceUp;
    }

    public void flip(boolean faceUp) {
        this.isFaceUp = !isFaceUp;
    }
}
