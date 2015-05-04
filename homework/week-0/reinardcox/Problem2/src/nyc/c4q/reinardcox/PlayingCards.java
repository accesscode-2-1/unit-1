package nyc.c4q.reinardcox;

import java.util.ArrayList;

/**
 * Created by Shadow on 5/3/2015.
 */
public class PlayingCards extends Game {
    private String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    private String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    private ArrayList<Card> completeDeck = new ArrayList<>();

    public PlayingCards () {
        for (int counter1 = 0; counter1 < 4; counter1++) {
            for (int counter2 = 0; counter2 < 13; counter2++) {
                Card card = new Card(suits[counter1],ranks[counter2]);
                completeDeck.add(card);
            }
        }
    }

    public void showDeck (){
        for (Card o : completeDeck) {
            o.showCard();
        }

    }

    public static void main(String[] args) {
        PlayingCards deckOfCards = new PlayingCards();
        deckOfCards.showDeck();

    }

}
