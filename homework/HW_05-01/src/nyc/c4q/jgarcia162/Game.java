package nyc.c4q.jgarcia162;
import java.util.ArrayList;

/**
 * Created by Jose on 4/29/15.
 */

//Create an abstract class representing a game, which includes the method getpieces()
public abstract class Game<E> {
    abstract ArrayList<E> getPieces();
}