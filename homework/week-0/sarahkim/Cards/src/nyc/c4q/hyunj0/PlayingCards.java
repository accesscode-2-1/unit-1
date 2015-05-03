package nyc.c4q.hyunj0;
import java.util.ArrayList;

public class PlayingCards extends Game
{
    ArrayList<Card> deck = new ArrayList<Card>();
    String[] suits = new String[] {"Diamonds", "Clubs", "Hearts", "Spades"};
    String[] ranks = new String[] {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    public PlayingCards () {
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck.add(new Card(suits[i], ranks[j]));
            }
        }
    }

    public Card getpieces (int i) {
        return this.deck.get(i);
    }
}
