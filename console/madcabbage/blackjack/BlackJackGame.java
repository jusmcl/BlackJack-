package console.madcabbage.blackjack;

import console.madcabbage.blackjack.card.Deck;

public class BlackJackGame {

    private Deck deck, discardPile;
    private Dealer dealer;
    private Player player;
    private int cas; // cards in a hand at the start
    private boolean play;

    public BlackJackGame(String playerName) {
        this.deck = new Deck(); this.discardPile = new Deck();
        this.dealer = new Dealer(deck);
        this.player = new Player(playerName);
        this.play = false;
        init();
        start();
    }

    public void init() {
        for (int i = 0; i <= cas * 2; i++) {
            if (i % 2 == 0) {
                player.giveCard(dealer.hit());
            } else {
                dealer.giveCard(dealer.hit());
            }

        }

        dealer.showHand();
        player.showHand();
    }

    public void start() {
        this.play = true;
        while(this.play) {
            // player turn

            // dealer turn

            // check winner and print
        }
    }
}
