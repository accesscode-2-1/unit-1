import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by Luke Lee on 5/1/2015.
 */
public class PlayingTrivia extends Game<Trivia> {

    ArrayList<Trivia> triviaDeck;

    public PlayingTrivia() {


        triviaDeck = new ArrayList<Trivia>();
        triviaDeck.add(new Trivia(""));

    }

    public void start() {

    }

    @Override
    ArrayList<Trivia> getPieces() {
        Collections.shuffle(triviaDeck);
        return triviaDeck;
    }
}
