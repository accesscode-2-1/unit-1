package nyc.c4q.m47bell;
/**
 * Created by c4q-marbella on 5/1/15.
 * Access Code 2-1
 * Marbella Vidals
 */
public class PlayingCards extends Game
{
    public int cardNum = 52;
    public Card[] deck;

    //constructor to generate new cards
    public PlayingCards()
    {
        deck = new Card[cardNum];

    }


}