package hw0501;

/**
 * Access Code 2.1
 * Ray Acevedo
 * PlayingCards.java
 */

public class Cards
{
    String suite;
    int cardNumber;


    public Cards(){}

    public Cards(String suite, int cardNumber)
    {
        this.suite = suite;
        this.cardNumber = cardNumber;
    }

    public void setSuite(String suite)
    {
        this.suite = suite;
    }

    public String getSuite() {return suite;}

    public void setCardNumber(int cardNumber) {}

    public int getCardNumber()
    {
        return cardNumber;
    }

    public static void main(String[] args){}
}