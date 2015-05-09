package nyc.c4q.ahhhlvin;
import java.util.ArrayList;

/**
 * Created by alvin2 on 4/29/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class PlayingCards extends Game {

    ArrayList<Card> deck;


    String[] suitArray = {"♠", "♥", "♦", "♣"};
    String[] valueArray = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

   public PlayingCards() {
       this.deck = getPieces(52);

       for(int i = 0; i < suitArray.length; i++)
       {
           for(int j = 0; j < valueArray.length; j++)
           {
               this.deck.add(new Card(suitArray[i], valueArray[j]));
           }
       }
   }

    public ArrayList<Card> getDeck() {
        return this.deck;
    }





    public static void main(String[] args) {
        PlayingCards myDeck = new PlayingCards();

        for (Card card : myDeck.getDeck()) {
            System.out.println(card);
        }
    }
}
