import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by kadeemmaragh on 5/1/15.
 */
public class PlayingCards extends Game
{
    ArrayList<Card> deck;


    //Creates a deck of playing cards and the hashmaps to later identify each card
    public PlayingCards()
    {
        deck = new ArrayList<Card>();
        for(int cardSuit = 1; cardSuit <= 4; cardSuit++)
        {
            for(int cardType = 1; cardType <= 14; cardType++){

                Card card = new Card(cardSuit,cardType);
                deck.add(card);
            }

        }
    }
    @Override
    public ArrayList getPieces()
    {
        return deck;
    }



}
