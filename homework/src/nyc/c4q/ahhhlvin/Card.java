package nyc.c4q.ahhhlvin;
/**
 * Created by alvin2 on 4/29/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class Card
{
    String suit;
    String value;

    public String getSuit()
    {
        return suit;
    }

    public String getValue()
    {
        return value;
    }

    public void setSuit(String suit)
    {
        this.suit = suit;
    }

    public Card(String suit, String value)
    {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        return getSuit() + getValue();
    }
}


