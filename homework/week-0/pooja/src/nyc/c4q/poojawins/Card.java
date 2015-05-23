package nyc.c4q.poojawins;

/**
 * Created by pooja on 5/1/15.
 */
public class Card {
    private String suit;
    private String value;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return getValue() + getSuit();
    }
}
