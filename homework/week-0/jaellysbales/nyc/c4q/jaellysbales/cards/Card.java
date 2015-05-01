package nyc.c4q.jaellysbales.cards;
/**
 * Access Code 2.1
 * Created by Jaellys Bales on 4/29/15.
 * Project: week-0
 * <p/>
 * ${FILE_NAME}
 * Enter a description.
 */
public class Card
{
    String rank;
    String suit;

    public String getRank()
    {
        return rank;
    }

    public String getSuit()
    {
        return suit;
    }


    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }
}
