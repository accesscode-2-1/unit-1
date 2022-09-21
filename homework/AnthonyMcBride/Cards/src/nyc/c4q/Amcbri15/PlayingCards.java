package nyc.c4q.Amcbri15;
import java.util.ArrayList;

/**
 * Created by c4q-anthony-mcbride on 5/1/15.
 */
public class PlayingCards extends Game
{
    ArrayList<Card> playingCards;
    // Creating arrays for nested loop to match each suit to a number
    String[] suits   = {" Diamonds", " Hearts", " Clubs", " Spades"};
    String[] numbers = {"A of", "K of", "Q of", "J of", "10 of", "9 of", "8 of", "7 of", "6 of", "5 of", "4 of", "3 of", "2 of"};

    public PlayingCards(int numCards)
    {
        // Loops over suit array and places each number from the number array along with the current suit into the playingCards ArrayList.
        this.playingCards = getPieces(numCards);
        for(int i = 0; i < suits.length; i++){
            for (int j = 0; j < numbers.length; j++){
                this.playingCards.add(new Card(suits[i], numbers[j]));
            }
        }
    }

    public ArrayList<Card> getPlayingCards(){
        return this.playingCards;
    }
}
