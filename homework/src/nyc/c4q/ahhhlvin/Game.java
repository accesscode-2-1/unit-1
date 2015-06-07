package nyc.c4q.ahhhlvin;
import java.util.ArrayList;

/**
 * Created by alvin2 on 4/29/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public abstract class Game<E>
{
    public ArrayList<E> getPieces(int howmany) {
        return new ArrayList<E>(howmany);
    }

}
