package console.madcabbage.blackjack.card;

public class Card {

    private String name;
    private Suit suit;
    private Face face;
    private Color color;
    private boolean isFaceUp;

    public Card(Suit suit, Face face, Color color) {
        StringBuilder sb = new StringBuilder();
        sb.append(color); sb.append(" "); sb.append(face.toString()); sb.append(" of "); sb.append(suit.toString()); sb.append(".");
        this.name = sb.toString();
        this.suit = suit;
        this.face = face;
        this.color = color;
        this.isFaceUp = false;
    }
}
