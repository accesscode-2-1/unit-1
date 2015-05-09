package nyc.c4q.sufeiiz.Cards;

import java.util.*;

/**
 * Created by sufeizhao on 5/9/15.
 */
public class PlayingCards extends Game {
    private final int maxCards = 52;
    private ArrayList<Card> cards = this.buildDeck();
    private char[] letter = new char[]{'A', 'J', 'Q', 'K'};

    public PlayingCards() {
    }

    public ArrayList<Card> buildDeck() {
        Iterator letterIter = Arrays.asList(new char[][]{this.letter}).iterator();

        while(letterIter.hasNext()) {
            this.cards.add(new Card(letterIter.next() + "♠"));
            this.cards.add(new Card(letterIter.next() + "♡"));
            this.cards.add(new Card(letterIter.next() + "♣"));
            this.cards.add(new Card(letterIter.next() + "♢"));
        }

        for(int i = 2; i <= 10; ++i) {
            this.cards.add(new Card(i + "♠"));
            this.cards.add(new Card(i + "♡"));
            this.cards.add(new Card(i + "♣"));
            this.cards.add(new Card(i + "♢"));
        }

        return this.cards;
    }

    public ArrayList<Card> getDeck() {
        return this.cards;
    }

    public Card getCard() {
        Random random = new Random();
        Collections.shuffle(this.cards);
        return (Card)this.getDeck().get(random.nextInt(52));
    }

    ArrayList getPieces() {
        return this.cards;
    }
}