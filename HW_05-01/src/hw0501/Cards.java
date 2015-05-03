package hw0501;

/**
 * Access Code 2.1
 * Ray Acevedo
 * PlayingCards.java
 */
//Create a class, Card, representing a playing card.
//In your constructor for PlayingCards,genereate a 52-deck hand of Cards.
//(Do not write 52 lines of code to do this). Decide an appropriate collection to store these in.
//Implement getpieces() which should return your collection of Cards. What should be the type
//signature for getpieces() in the abstract class?

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