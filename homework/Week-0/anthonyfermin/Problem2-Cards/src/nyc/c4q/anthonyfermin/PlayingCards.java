package nyc.c4q.anthonyfermin;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by c4q-anthonyf on 5/1/15.
 */
public class PlayingCards extends Game<Card>
{
    ArrayList<Card> deck;

    public PlayingCards(){
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        deck = new ArrayList<Card>();

        for(String suit : suits)
        {
            for(int i = 0; i < 13; i++)
            {
                deck.add(new Card(suit, i));
            }
        }
    }

    @Override
    public List<Card> getPieces()
    {
        return deck;
    }
}
