package nyc.c4q.lukesterlee;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        PlayingCards game = new PlayingCards();
        ArrayList<Card> cardDeck = game.getPieces();

        for (Card card : cardDeck) {
            System.out.println(card.getNumber() + " " + card.getSuit());
        }
    }
}
