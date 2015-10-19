package nyc.c4q.alizinha;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by c4q-Allison on 5/2/15.
 */
public class PlayingCards extends Game
{
    ArrayList<Card> deck;

    public PlayingCards() {

        String[] number = new String[]{"Ace", "Deuce", "Three"};
        String[] suit = new String[] {"Spades", "Clubs",};
        deck = new ArrayList<Card>();
        for  (int i = 0; i < number.length; i++) {
            for (int j = 0; j < suit.length; j++ ){
                deck.add(new Card(number[i], suit[j]));
            }
        }

    }
    @Override
    ArrayList<Card> getPieces(){
        Collections.shuffle(deck);
        return deck;
    }

}
