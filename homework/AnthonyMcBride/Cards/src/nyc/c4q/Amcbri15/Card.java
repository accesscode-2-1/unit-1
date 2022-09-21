package nyc.c4q.Amcbri15;
/**
 * Created by c4q-anthony-mcbride on 5/1/15.
 */
public class Card
{
    String suit;
    String number;

    Card(){
    }
    public Card(String suit, String number){
        this.suit = suit;
        this.number = number;
    }

    // Getters to check my current card (mostly for testing nested loop logic in PlayingCards)
    public String getSuit(){
        return this.suit;
    }
    public String getNumber(){
        return this.number;
    }

    // Override the Object toString() method so we don't see reference values...
    @Override
    public String toString(){
        return getNumber() + getSuit();
    }
}
