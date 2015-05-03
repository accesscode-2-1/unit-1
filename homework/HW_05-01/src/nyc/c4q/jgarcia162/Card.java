package nyc.c4q.jgarcia162;
/**
 * Created by Jose on 4/29/15.
 */

//Create a class, Card, representing a playing card.
public class Card {
    String number;
    String suit;

    public Card(String number, String suit) {
        this.number = number;
        this.suit = suit;
    }

    public String getNumber() {
        return number;
    }

    public String getSuit() {
        return suit;
    }
}
