package nyc.c4q.m47bell;
import java.util.ArrayList;

/**
 * Created by c4q-marbella on 5/1/15.
 * Access Code 2-1
 * Marbella Vidals
 */
public class PlayingCards extends Game
{

    ArrayList<Card> deckOfCards;
    String [] suitTypes = {"Hearts","Diamonds","Spades", "Clubs"};
    String [] cardValue = {"A","K","Q","J","10","9","8","7","6","5","4","3","2"};

    public int numCards = 52;


    //constructor to generate new cards
    public PlayingCards()
    {
       this.deckOfCards = getpieces(numCards);

        for (int suit = 0; suit < suitTypes.length; suit++)
        {
            for(int value = 1; value < cardValue.length; value++){

                //adds a new card with a suit and value at each iteration
                //this line returns an error, can't figure out how to fix it
                this.deckOfCards.add(new Card(suitTypes[suit],cardValue[value]));
            }
        }

    }

    public PlayingCards(ArrayList<Card> deckOfCards)
    {
        this.deckOfCards = deckOfCards;
    }

    @Override
    public ArrayList getpieces(int numCards)
    {
        return null;
    }

    @Override
    public String toString()
    {
        return String.valueOf(deckOfCards);
    }
}
