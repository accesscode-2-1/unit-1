package nyc.c4q.personabe1984;
/**
 * Created by Hans on 5/6/15.
 */
public class Card {

    private String suit;
    private String value;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    public String getSuit() {
        return this.suit;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return getSuit() + " " + getValue();
    }

}