package hw0501;
import java.util.ArrayList;

/**
 * Access Code 2.1
 * Ray Acevedo
 * PlayingCards.java
 */
public class PlayingCards extends Game
{
    ArrayList<Cards> cards = new ArrayList<Cards>();


    public PlayingCards()  //creates a deck of cards
    {
        ArrayList<String> suits = new ArrayList<String>();
        suits.add("Clubs");
        suits.add("Hearts");
        suits.add("Spades");
        suits.add("Diamonds");
        for(String suite : suits)
        {
            for(int i = 1; i < 14; i++)
            {
                Cards card = new Cards(suite, i);
                this.cards.add(card);
            }
        }
    }

    @Override
    public ArrayList getPieces()
    {
        return cards;
    }

    public static void listPieces(ArrayList<Cards> arraylist)
    {
        for(Cards card : arraylist)
        {
            System.out.println(card.getSuite() + card.getCardNumber());
        }
    }

    public static void main(String[] args){}
}
