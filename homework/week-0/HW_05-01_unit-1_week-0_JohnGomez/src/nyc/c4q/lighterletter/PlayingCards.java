package nyc.c4q.lighterletter;
import java.util.ArrayList;

/**
 * Created by c4q-john on 4/29/15.
 */
public class PlayingCards extends Game
{
    public void PlayingCards()
    {
        ArrayList<Card> cards = new ArrayList<Card>();

        for(int i = 0; i < 52; i++)
        {
            Card newCard = new Card();
            cards.add(newCard);
        }
    }

    @Override
    public ArrayList<Card> getPieces()
    {
        return null;
    }
}
