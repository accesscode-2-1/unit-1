import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Luke Lee on 4/27/2015.
 */
public class PlayingCards extends Game<Card> {

    ArrayList<Card> cardDeck;

    public PlayingCards() {

        String[] number = new String[] {"2", "3", "4", "5", "6", "7", "8", "9", "10" , "J", "Q", "K", "A"};
        String[] suit = new String[] {"Diamonds", "Hearts", "Clubs", "Spades"};
        cardDeck = new ArrayList<Card>();
        for (int i = 0; i < number.length; i++) {

            for (int j = 0; j < suit.length; j++) {
                cardDeck.add(new Card(number[i], suit[j]));
            }

        }

    }
    @Override
    ArrayList<Card> getPieces() {
        Collections.shuffle(cardDeck);
        return cardDeck;
    }
}
