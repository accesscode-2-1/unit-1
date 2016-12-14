package nyc.c4q.fattyduck;
/**
 * Created by fattyduck on 4/27/15.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class PlayingCards extends Game
{
    public List<Card> getPieces(int size){
        List<Card> l = new ArrayList<Card>();
        Random rand = new Random();
        while(l.size()!=size){
            int r = rand.nextInt(52);
            Card c = new Card(r);
            l.add(c);

        }
        return l;
    }

    public List<Card> deck(){
        List<Card> l = new ArrayList<Card>();
        for(int i = 1; i < 53; i++){
            Card c = new Card(i);
            l.add(c);
        }
        return l;
    }

}
