package nyc.c4q.sufeiiz.Cards;

/**
 * Created by sufeizhao on 4/27/15.
 * Create a class, Card, representing a playing card.
 */

public class Card {

    private final int maxCards = 52;
    private String card;
    private PlayingCards deck;

    public Card(String card) {
        this.card = card;
    }
}
