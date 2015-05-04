import java.util.ArrayList;

/**
 * Created by kadeemmaragh on 5/1/15.
 */
public class PlayingCards extends Game
{
    ArrayList<Card> deck;
    public PlayingCards(){
        deck = new ArrayList<Card>();

        for(int i = 0; i < 52; i++){
            Card card = new Card();
            deck.add(card);
        }
    }
    @Override
    public ArrayList getPieces()
    {
        return deck;
    }
}
