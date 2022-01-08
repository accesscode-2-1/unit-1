package nyc.c4q.m47bell;
/**
 * Created by c4q-marbella on 5/1/15.
 * Access Code 2-1
 * Marbella Vidals
 */
public class Card
{
    String suitType;
    String cardValue;

    public Card(String suitType, String cardValue)
    {
        this.suitType = suitType;
        this.cardValue = cardValue;
    }

    public String getSuitType()
    {
        return suitType;
    }

    public void setSuitType(String suitType)
    {
        this.suitType = suitType;
    }

    public String getCardValue()
    {
        return cardValue;
    }

    public void setCardValue(String cardValue)
    {
        this.cardValue = cardValue;
    }

    @Override
    public String toString()
    {
        return suitType + cardValue;
    }
}
