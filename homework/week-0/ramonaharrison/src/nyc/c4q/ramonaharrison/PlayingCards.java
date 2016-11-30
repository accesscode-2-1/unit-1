package nyc.c4q.ramonaharrison;

import java.util.ArrayList;

/**
 * Access Code 2.1
 * Ramona Harrison
 * PlayingCards.java
 */

public class PlayingCards extends Game {

    private ArrayList<Card> deck;
    private String[] suits = {"♥","♠","♦","♣"};
    private String[] values = {"A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    public PlayingCards(int numberOfCards) {

       this.deck = getPieces(numberOfCards);
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < values.length; j++) {
                this.deck.add(new Card(suits[i], values[j]));
            }
        }

    }

    public ArrayList<Card> getDeck() {
        return this.deck;
    }

    public static void main(String[] args) {
        PlayingCards myDeck = new PlayingCards(52);

        for (Card card: myDeck.getDeck()) {
            System.out.println(card);
        }
    }

}
