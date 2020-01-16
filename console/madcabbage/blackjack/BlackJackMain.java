package console.madcabbage.blackjack;

import console.madcabbage.blackjack.BlackJackGame;
import console.madcabbage.blackjack.card.Card;
import console.madcabbage.blackjack.card.Suit;

import java.util.Scanner;

public class BlackJackMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        printWelcomeScreen();
        System.out.print("Enter Name: ");
        BlackJackGame game = new BlackJackGame(scan.nextLine()); scan.close();

    }

    private static void printWelcomeScreen() {
        System.out.println("Welcome to MadJack's BlackJack table!\n\n");
    }
}
