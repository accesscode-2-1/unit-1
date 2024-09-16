package nyc.c4q.jvvlives2005;
/**
 * Created by c4q-joshelynvivas on 5/5/15.
 */
public class PlayingCards extends Game
{

    private final Card[] cards;

    public PlayingCards()
    {
        Card cards;
        this.cards = new Card[52];
        for (int i = 0; i < 52 ; i++) {
            Card card = new Card();  //Instantiate a Card
            this.cards[i] = card; //Adding card to the Deck
        }
    }
}
