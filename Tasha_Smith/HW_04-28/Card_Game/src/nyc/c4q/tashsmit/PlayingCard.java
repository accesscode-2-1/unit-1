package nyc.c4q.tashsmit;
import java.util.ArrayList;

/**
 * Created by c4q-tashasmith on 4/29/15.
 */
public class PlayingCard extends CardGame
{
    ArrayList<Card> cards;

    public PlayingCard () {
        cards = new ArrayList<Card>();

        for(int i = 0; i < 52; i++)
        {
            Card newCard = new Card();
            cards.add(newCard);
        }

    }

    public  ArrayList<Card> getPieces ()
    {
        return cards;

    }


}
