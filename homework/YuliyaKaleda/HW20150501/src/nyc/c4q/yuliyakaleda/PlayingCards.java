package nyc.c4q.yuliyakaleda;

/**
 * Second Exercise
 * Created by Yuliya Kaleda on 4/27/15.
 */
public class PlayingCards extends Game
{
    private Card[] deck;
    private int numCards = 52;

    public PlayingCards() {
        for (int i = 0; i < numCards; i++ ) {
            deck[i] = new Card();
        }
    }

    public Card[] getPieces() {
        return deck;
    }
}
