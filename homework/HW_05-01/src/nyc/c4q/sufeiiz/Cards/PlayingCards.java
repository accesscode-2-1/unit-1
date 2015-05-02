package nyc.c4q.sufeiiz.Cards;

import java.util.*;

/**
 * Created by sufeizhao on 4/27/15.
 *  Create a class that extends your Game class, PlayingCards.
 *  In your constructor for PlayingCards, genereate a 52-deck hand of Cards.
 *  (Do not write 52 lines of code to do this). Decide an appropriate collection to store these in.
 */

public class PlayingCards extends Game{

    private final int maxCards = 52;
    private ArrayList<Card> cards;
    private char[] letter = {'A', 'J', 'Q', 'K'};

    public PlayingCards() {
        this.cards = buildDeck();
    }

    public ArrayList<Card> buildDeck() {
        Iterator letterIter = Arrays.asList(letter).iterator();
        while (letterIter.hasNext()) {
            cards.add(new Card(letterIter.next() + "♠"));
            cards.add(new Card(letterIter.next() + "♡"));
            cards.add(new Card(letterIter.next() + "♣"));
            cards.add(new Card(letterIter.next() + "♢"));
        }

        for (int i = 2; i <= 10; i++) {
            cards.add(new Card(i + "♠"));
            cards.add(new Card(i + "♡"));
            cards.add(new Card(i + "♣"));
            cards.add(new Card(i + "♢"));
        }

        return cards;
    }

    public ArrayList<Card> getDeck() {
        return cards;
    }

    public Card getCard() {
        Random random = new Random();
        Collections.shuffle(cards);
        return this.getDeck().get(random.nextInt(52));
    }


    @Override
    ArrayList getPieces() {
        return this.cards;
    }
}