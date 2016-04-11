package nyc.c4q.jgarcia162;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Jose on 4/29/15.
 */

//Create a class that extends your Game class, PlayingCards
public class PlayingCards extends Game {

    //In your constructor for PlayingCards, genereate a 52-deck hand of Cards. (Do not write 52 lines of code to do this). Decide an appropriate collection to store these in.
    ArrayList<Card> cardDeck;
    public PlayingCards(){
        String[] number = new String[] {"2", "3", "4", "5", "6", "7", "8", "9", "10" , "J", "Q", "K", "A"};
        String[] suit = new String[] {"Diamonds", "Hearts", "Clubs", "Spades"};

        cardDeck = new ArrayList<Card>();
        for (int i = 0; i < number.length; i++) {

            for (int j = 0; j < suit.length; j++) {
                cardDeck.add(new Card(number[i], suit[j]));
            }
        }
    }

    //Implement getpieces() which should return your collection of Cards.
    @Override
    ArrayList<Card> getPieces() {
        Collections.shuffle(cardDeck);
        return cardDeck;
    }
}
