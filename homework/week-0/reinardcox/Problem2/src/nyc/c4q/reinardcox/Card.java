package nyc.c4q.reinardcox;

/**
 * Created by Shadow on 5/3/2015.
 */
public class Card {
    private String suit, number;

    public Card(String suit, String number) {
        this.suit = suit;
        this.number = number;
    }

    public void showCard () {
        System.out.println(number + " of " + suit);
    }



}
