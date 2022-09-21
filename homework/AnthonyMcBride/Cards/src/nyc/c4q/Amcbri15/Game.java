package nyc.c4q.Amcbri15;
import java.util.ArrayList;

/**
 * Created by c4q-anthony-mcbride on 5/1/15.
 */
public abstract class Game<E>
{
    // <E> will be changed to whatever type I use to call this method.
    public ArrayList<E> getPieces(int numPieces) {
        return new ArrayList<E>(numPieces);
    }

}

