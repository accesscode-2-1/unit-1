import java.util.ArrayList;
import java.util.Collections;
/**
 * Access Code 2.1
 * Created by Jaellys Bales on 4/29/15.
 * Project: Cards
 */
public class PlayingCards extends Game<Card>
{
    ArrayList<Card> deck;

    public PlayingCards()
    {
        deck = new ArrayList<Card>();
        String[] suits = {"♣", "♦", "♥", "♠"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        // Build the deck.
        for(int i = 0; i < ranks.length; i++)
        {
            for(int j = 0; j < suits.length; j++)
            {
                deck.add(new Card(ranks[i], suits[j]));
            }
        }
    }

    @Override
    public ArrayList<Card> getPieces()
    {
        ArrayList<Card> myDeck = new ArrayList<Card>(deck);
        Collections.shuffle(deck);
        return deck;
    }
}
