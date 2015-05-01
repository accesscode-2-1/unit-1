package nyc.c4q.jaellysbales.cards;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Access Code 2.1
 * Created by Jaellys Bales on 4/29/15.
 * Project: week-0
 * <p/>
 * ${FILE_NAME}
 * Enter a description.
 */
public class PlayingCards extends Game<Card>
{
    ArrayList<Card> deck;

    public PlayingCards()
    {
        deck = new ArrayList<Card>();
        String[] suits = {"♣", "♦", "♥", "♠"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for(int i = 0; i < ranks.length; i++)
        {
            for(int j = 0; j < suits.length; j++)
            {
                deck.add(new Card(ranks[i], suits[j]));
            }
        }
    }

    @Override
    public ArrayList<Card> getpieces()
    {
        Collections.shuffle(deck);
        return deck;
    }
}
