package nyc.c4q.charlyn23;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by charlynbuchanan on 4/29/15.
 */
public class PlayingCards extends Game  {
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
